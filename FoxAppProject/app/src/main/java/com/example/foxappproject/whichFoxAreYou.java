package com.example.foxappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class whichFoxAreYou extends  AppCompatActivity {
    private int a=0;
    private int b=0;
    private int c=0;
    private int d=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox_quiz);
    }

    public void foxA(View view) {
        a++;
    }
    public void foxB(View view) {
        b++;
    }
    public void foxC(View view) {
        c++;
    }
    public void foxD(View view) {
        d++;
    }

    public void showFoxPhoto(View view) {
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        if(max==a) {
            Intent switchActivityIntent = new Intent(this, quizFoxAnswerA.class);
            startActivity(switchActivityIntent);
        }
        if(max==b) {
            Intent switchActivityIntent = new Intent(this, quizFoxAnswerB.class);
            startActivity(switchActivityIntent);
        }
        if(max==c) {
            Intent switchActivityIntent = new Intent(this, quizFoxAnswerC.class);
            startActivity(switchActivityIntent);
        }
        if(max==d) {
            Intent switchActivityIntent = new Intent(this, quizFoxAnswerD.class);
            startActivity(switchActivityIntent);
        }

        }

}
