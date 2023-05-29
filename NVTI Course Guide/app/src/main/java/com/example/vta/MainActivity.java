package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
//    ImageView imageView;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the id for the progressbar
        progressBar = findViewById(R.id.progress_bar);
//        imageView=findViewById(R.id.imageView);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // set the limitations for the numeric
                // text under the progress bar
                if (i <= 100) {
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(this, 20);
                } else {
                    handler.removeCallbacks(this);
                    Intent home = new Intent(MainActivity.this,Home.class);
                    startActivity(home);
                }
            }
        }, 20);



    }
}