package com.example.whack_a_mole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static List<Boolean> list = new ArrayList<>();
    static int lives = 5;
    static int points = 0;

    TextView tv_points;
    TextView tv_lives;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for (int i = 0; i < 9; i++) {
            list.add(false);
        }

        ImageButton button[] = new ImageButton[9];
        button[0] = findViewById(R.id.b1);
        button[1] = findViewById(R.id.b2);
        button[2] = findViewById(R.id.b3);
        button[3] = findViewById(R.id.b4);
        button[4] = findViewById(R.id.b5);
        button[5] = findViewById(R.id.b6);
        button[6] = findViewById(R.id.b7);
        button[7] = findViewById(R.id.b8);
        button[8] = findViewById(R.id.b9);
        tv_points = findViewById(R.id.points);
        tv_lives = findViewById(R.id.lives);

        tv_lives.setText(String.valueOf(lives));
        tv_points.setText(String.valueOf(points));

        for (int i = 0; i < 9; i++) {
            button[i].setImageResource(R.drawable.whackamoles_off);
        }

        Handler handler = new Handler();

        Runnable r=new Runnable() {
            public void run() {
                int index = runIt(button);
                Handler tempHand = new Handler();
                Runnable temp = new Runnable() {
                    @Override
                    public void run() {
                        button[index].setImageResource(R.drawable.whackamoles_off);
                    }
                };
                tempHand.postDelayed(temp,300);
                handler.postDelayed(this,300);
            }
        };

        handler.postDelayed(r, 200);



    }

    public int runIt(ImageButton button[]) {
        int index = new Random().nextInt(9);
        list.set(index, true);
        button[index].setImageResource(R.drawable.whackamoles_on);
        list.set(index, false);
        return index;

    }
    public void onClick(View view)
    {
        switch(view.getId()){
            case R.id.b1 :
                if (list.get(0) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b2 :
                if (list.get(1) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b3:
                if (list.get(2) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b4:
                if (list.get(3) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b5:
                if (list.get(4) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b6:
                if (list.get(5) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b7 :
                if (list.get(6) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b8:
                if (list.get(7) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;

            case R.id.b9 :
                if (list.get(8) == true) {
                    points++;
                    tv_points.setText(String.valueOf(points));
                }
                else {
                    lives--;
                    tv_lives.setText(String.valueOf(lives));
                }
                break;
        }

    }





}

//    public void initialise(ImageButton button[])
//    {
//        button[0] = findViewById(R.id.b1);
//        button[1] = findViewById(R.id.b2);
//        button[2] = findViewById(R.id.b3);
//        button[3] = findViewById(R.id.b4);
//        button[4] = findViewById(R.id.b5);
//        button[5] = findViewById(R.id.b6);
//        button[6] = findViewById(R.id.b7);
//        button[7] = findViewById(R.id.b8);
//        button[8] = findViewById(R.id.b9);
//    }




//        new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            },200);


//        initialise(button);

//        int index = new Random().nextInt(9);
//        list.set(index, true);
//        for (int i = 0; i < 9; i++) {
//            button[i].setImageResource(R.drawable.whackamoles_off);
//        }
//        button[index].setImageResource(R.drawable.whackamoles_on);
//        list.set(index, false);
//
//        while(lives > 0)
//        {
//
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            },100);


//            lives--;
//            points++;
//            tv_lives.setText(String.valueOf(lives));
//            tv_points.setText(String.valueOf(points));
//        }