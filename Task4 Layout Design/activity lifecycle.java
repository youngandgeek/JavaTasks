package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Activity Lifecycle","onCreate invoked");



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle","onStart invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle","onResume invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle","onPause invoked");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle","onStop invoked");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle","onRestart invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle","onDestroy invoked");

    }






}