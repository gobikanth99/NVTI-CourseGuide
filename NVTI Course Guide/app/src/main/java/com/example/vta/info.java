package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class info extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4;
    LinearLayout l1,l2,l3,l4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        txt1=findViewById(R.id.txt1);
        l1=findViewById(R.id.l1);
        l1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt2=findViewById(R.id.txt2);
        l2=findViewById(R.id.l2);
        l2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt3=findViewById(R.id.txt3);
        l3=findViewById(R.id.l3);
        l3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt4=findViewById(R.id.txt4);
        l4=findViewById(R.id.l4);
        l4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }

    public void expand(View view) {
        int v = (txt1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l1,new AutoTransition());
        txt1.setVisibility(v);
    }

    public void expand2(View view) {

        int v = (txt2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l2,new AutoTransition());
        txt2.setVisibility(v);
    }

    public void expand3(View view) {

        int v = (txt3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l3,new AutoTransition());
        txt3.setVisibility(v);
    }

    public void expand4(View view) {

        int v = (txt4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l4,new AutoTransition());
        txt4.setVisibility(v);
    }
}