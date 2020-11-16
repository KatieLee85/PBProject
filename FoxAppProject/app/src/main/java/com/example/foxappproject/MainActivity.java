package com.example.foxappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button switchToRandomPics;
    String url;
    com.example.foxappproject.FetchRandomPic pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToRandomPics = findViewById(R.id.go_to_random);
        switchToRandomPics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToRandomPics();
            }
        });

        url = "https://randomfox.ca/images/" + 4 + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.homeFoxPic));
        pic.execute(url);
    }

    public void foxQuiz(View view) {
        Intent goToQuiz = new Intent(this, whichFoxAreYou.class);
        startActivity(goToQuiz);
    }

    public void switchToRandomPics() {
        Intent switchActivityIntent = new Intent(this, RandomPics.class);
        startActivity(switchActivityIntent);
    }
}