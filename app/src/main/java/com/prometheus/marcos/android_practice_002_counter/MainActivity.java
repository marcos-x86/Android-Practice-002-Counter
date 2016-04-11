package com.prometheus.marcos.android_practice_002_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberOfPointsA=0;
    int numberOfPointsB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method add three point for Team A
     */
    public void addThreePointsA(View view) {
        addPointsA(3);
    }

    /**
     * This method add two point for Team A
     */
    public void addTwoPointsA(View view) {
        addPointsA(2);
    }

    /**
     * This method add one point for Team A
     */
    public void addOnePointsA(View view) {
        addPointsA(1);
    }

    public void addPointsA(int number){
        numberOfPointsA=numberOfPointsA+number;
        TextView counterA=(TextView)findViewById(R.id.counterA);
        counterA.setText("" + numberOfPointsA);
    }

    /**
     * This method add three point for Team B
     */
    public void addThreePointsB(View view) {
        addPointsB(3);
    }

    /**
     * This method add two point for Team B
     */
    public void addTwoPointsB(View view) {
        addPointsB(2);
    }

    /**
     * This method add one point for Team B
     */
    public void addOnePointsB(View view) {
        addPointsB(1);
    }

    public void addPointsB(int number){
        numberOfPointsB=numberOfPointsB+number;
        TextView counterA=(TextView)findViewById(R.id.counterB);
        counterA.setText(""+numberOfPointsB);
    }

    public void resetPoints(View view) {
        numberOfPointsA=0;
        numberOfPointsB=0;
        TextView counterA=(TextView)findViewById(R.id.counterA);
        TextView counterB=(TextView)findViewById(R.id.counterB);
        counterA.setText(""+numberOfPointsA);
        counterB.setText(""+numberOfPointsB);
    }
}