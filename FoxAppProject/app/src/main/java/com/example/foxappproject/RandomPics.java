package com.example.foxappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class RandomPics extends AppCompatActivity {
    com.example.foxappproject.FetchRandomPic pic;
    String url;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_pics);

        int randInt = random.nextInt(121) + 1;
        url = "https://randomfox.ca/images/" + randInt + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.random_pic_output));
        pic.execute(url);
    }
    public void loadpic(View view) {
        int randInt = random.nextInt(122);
        url = "https://randomfox.ca/images/" + randInt + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.random_pic_output));
        pic.execute(url);
    }

    public void back(View view) {
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
    }
}