package com.example.buka.nanodegreeportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button popularMoviesButton =  (Button)findViewById(R.id.popular_movies_button);
        Button stockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_bigger_button);
        Button makeYourAppMaterialButton = (Button) findViewById(R.id.make_material_button);
        Button goUbuquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);*/

    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        switch (view.getId()) {
            case R.id.build_bigger_button:
                makeToast("This button openes the Build It Bigger app");
                break;
            case R.id.capstone_button:
                makeToast("This button openes the Capstone app");
                break;
            case R.id.go_ubiquitous_button:
                makeToast("This button openes the Go Ubiquitous app");
                break;
            case R.id.make_material_button:
                makeToast("This button openes the Make Material app");
                break;
            case R.id.popular_movies_button:
                makeToast("This button openes the Popular Movies app");
                break;
            case R.id.stock_hawk_button:
                makeToast("This button openes the Stock Hawk app");
                break;
        }
    }

    private void makeToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
