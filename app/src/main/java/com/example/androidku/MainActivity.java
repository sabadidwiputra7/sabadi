package com.example.androidku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//20-mei-2019
// Nim 10116314
// nama : Sabadi Dwiputra
// kelas : IF-7

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread() {
            public void run(){
                try{
                    sleep(6000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(MainActivity.this ,viewpager.class));
                    finish();
                }
            }



        };
        thread.start();


    }
}
