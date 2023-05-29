package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button btninfo,btnict,btncourse,btnmap,btnexit,feedb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btninfo = findViewById(R.id.btninfo);
        btnict = findViewById(R.id.btnict);
        btncourse = findViewById(R.id.btncourse);
        btnmap = findViewById(R.id.btnmap);
        btnexit = findViewById(R.id.btnexit);
        feedb = findViewById(R.id.feedb);


//        String anroidid= Settings.Secure.getString(this.getContentResolver(),Settings.Secure.ANDROID_ID);
        String anroidid = Build.DEVICE;

        Toast.makeText(Home.this, "Welcome  "+anroidid.toUpperCase(), Toast.LENGTH_SHORT).show();

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this , info.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Info", Toast.LENGTH_SHORT).show();
            }
        });

        btnict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this , ndict.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Centers", Toast.LENGTH_SHORT).show();
            }
        });

        btncourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this , courses.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Courses", Toast.LENGTH_SHORT).show();
            }
        });

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this , map.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Social Media", Toast.LENGTH_SHORT).show();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(Intent.ACTION_MAIN);
//                intent.addCategory(Intent.CATEGORY_HOME);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);

                Toast.makeText(Home.this, "Exit", Toast.LENGTH_SHORT).show();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        feedb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this , feedback.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Feed Back", Toast.LENGTH_SHORT).show();
            }
        });


    }
    @Override
    public void onBackPressed(){

    }
}