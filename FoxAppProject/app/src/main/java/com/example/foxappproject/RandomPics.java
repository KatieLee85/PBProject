package com.example.foxappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class RandomPics extends AppCompatActivity {
    Button backButton;
    Button loadPicsButton;
    com.example.foxappproject.FetchRandomPic pic;
    String url;
    Random random = new Random();
    TextView mShowID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_pics);

        int randInt = random.nextInt(122) + 1;
        url = "https://randomfox.ca/images/" + randInt + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.random_pic_output));
        pic.execute(url);

        backButton = findViewById(R.id.go_to_home_from_random);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        loadPicsButton = findViewById(R.id.load_pics_button);
        loadPicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadpic();
            }
        });
    }

    private void loadpic() {
        int randInt = random.nextInt(122);
        url = "https://randomfox.ca/images/" + randInt + ".jpg";
        pic = new com.example.foxappproject.FetchRandomPic(findViewById(R.id.random_pic_output));
        pic.execute(url);
    }

}