package com.example.foxappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quizFoxAnswerA extends  AppCompatActivity {
    String url;
    com.example.foxappproject.FetchRandomPic pic;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showfoxresult);

        url = "https://randomfox.ca/images/" + 32 + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.foxPicQuiz));
        pic.execute(url);

    }

    public void backHomebutton(View view) {
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
    }
}
