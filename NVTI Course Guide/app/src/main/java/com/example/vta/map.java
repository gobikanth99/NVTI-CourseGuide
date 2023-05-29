package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class map extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    LinearLayout l1,l2;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);

        l1=findViewById(R.id.l1);
        l1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        l2=findViewById(R.id.l2);
        l2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://web.facebook.com/vtasl");
                openweb(uri);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://web.facebook.com/nvtivantarumoolai.vtavantharumoolai");
                openweb(uri);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.youtube.com/@vtvvocationaltelevision2139");
                openweb(uri);
            }
        });


    }

    public void expand(View view) {

        int v = (txt1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v1 = (txt2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l1,new AutoTransition());
        txt1.setVisibility(v);
        txt2.setVisibility(v1);
    }

    public void expand2(View view) {

        int v = (txt3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l2,new AutoTransition());
        txt3.setVisibility(v);
    }

    private void openweb(Uri uri) {
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}