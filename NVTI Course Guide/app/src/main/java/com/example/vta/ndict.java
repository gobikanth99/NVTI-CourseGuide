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

public class ndict extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;

    TextView txt1_av,txt1_con,txt1_phone,txt1_location,txt1_web;
    TextView txt2_av,txt2_con,txt2_phone,txt2_location,txt2_web;
    TextView txt3_av,txt3_con,txt3_phone,txt3_location,txt3_web;
    TextView txt4_av,txt4_con,txt4_phone,txt4_location,txt4_web;
    TextView txt5_av,txt5_con,txt5_phone,txt5_location,txt5_web;
    TextView txt6_av,txt6_con,txt6_phone,txt6_location,txt6_web;
    TextView txt7_av,txt7_con,txt7_phone,txt7_location,txt7_web;
    TextView txt8_av,txt8_con,txt8_phone,txt8_location,txt8_web;
    TextView txt9_av,txt9_con,txt9_phone,txt9_location,txt9_web;
    TextView txt10_av,txt10_con,txt10_phone,txt10_location,txt10_web;
    TextView txt11_av,txt11_con,txt11_phone,txt11_location,txt11_web;


    String number;
    Uri uri;



    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndict);


        txt1=findViewById(R.id.txt1);
        txt1_av=findViewById(R.id.txt1_av);
        txt1_con=findViewById(R.id.txt1_con);
        txt1_phone=findViewById(R.id.txt1_phone);
        txt1_location=findViewById(R.id.txt1_location);
        txt1_web=findViewById(R.id.txt1_web);
        l1=findViewById(R.id.l1);
        l1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        -----------------------------------------------------------------------------------------

        txt2=findViewById(R.id.txt2);
        txt2_av=findViewById(R.id.txt2_av);
        txt2_con=findViewById(R.id.txt2_con);
        txt2_phone=findViewById(R.id.txt2_phone);
        txt2_location=findViewById(R.id.txt2_location);
        txt2_web=findViewById(R.id.txt2_web);
        l2=findViewById(R.id.l2);
        l2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt3=findViewById(R.id.txt3);
        txt3_av=findViewById(R.id.txt3_av);
        txt3_con=findViewById(R.id.txt3_con);
        txt3_phone=findViewById(R.id.txt3_phone);
        txt3_location=findViewById(R.id.txt3_location);
        txt3_web=findViewById(R.id.txt3_web);
        l3=findViewById(R.id.l3);
        l3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt4=findViewById(R.id.txt4);
        txt4_av=findViewById(R.id.txt4_av);
        txt4_con=findViewById(R.id.txt4_con);
        txt4_phone=findViewById(R.id.txt4_phone);
        txt4_location=findViewById(R.id.txt4_location);
        txt4_web=findViewById(R.id.txt4_web);
        l4=findViewById(R.id.l4);
        l4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt5=findViewById(R.id.txt5);
        txt5_av=findViewById(R.id.txt5_av);
        txt5_con=findViewById(R.id.txt5_con);
        txt5_phone=findViewById(R.id.txt5_phone);
        txt5_location=findViewById(R.id.txt5_location);
        txt5_web=findViewById(R.id.txt5_web);
        l5=findViewById(R.id.l5);
        l5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt6=findViewById(R.id.txt6);
        txt6_av=findViewById(R.id.txt6_av);
        txt6_con=findViewById(R.id.txt6_con);
        txt6_phone=findViewById(R.id.txt6_phone);
        txt6_location=findViewById(R.id.txt6_location);
        txt6_web=findViewById(R.id.txt6_web);
        l6=findViewById(R.id.l6);
        l6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        -----------------------------------------------------------------------------------------

        txt7=findViewById(R.id.txt7);
        txt7_av=findViewById(R.id.txt7_av);
        txt7_con=findViewById(R.id.txt7_con);
        txt7_phone=findViewById(R.id.txt7_phone);
        txt7_location=findViewById(R.id.txt7_location);
        txt7_web=findViewById(R.id.txt7_web);
        l7=findViewById(R.id.l7);
        l7.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt8=findViewById(R.id.txt8);
        txt8_av=findViewById(R.id.txt8_av);
        txt8_con=findViewById(R.id.txt8_con);
        txt8_phone=findViewById(R.id.txt8_phone);
        txt8_location=findViewById(R.id.txt8_location);
        txt8_web=findViewById(R.id.txt8_web);
        l8=findViewById(R.id.l8);
        l8.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt9=findViewById(R.id.txt9);
        txt9_av=findViewById(R.id.txt9_av);
        txt9_con=findViewById(R.id.txt9_con);
        txt9_phone=findViewById(R.id.txt9_phone);
        txt9_location=findViewById(R.id.txt9_location);
        txt9_web=findViewById(R.id.txt9_web);
        l9=findViewById(R.id.l9);
        l9.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt10=findViewById(R.id.txt10);
        txt10_av=findViewById(R.id.txt10_av);
        txt10_con=findViewById(R.id.txt10_con);
        txt10_phone=findViewById(R.id.txt10_phone);
        txt10_location=findViewById(R.id.txt10_location);
        txt10_web=findViewById(R.id.txt10_web);;
        l10=findViewById(R.id.l10);
        l10.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------

        txt11=findViewById(R.id.txt11);
        txt11_av=findViewById(R.id.txt11_av);
        txt11_con=findViewById(R.id.txt11_con);
        txt11_phone=findViewById(R.id.txt11_phone);
        txt11_location=findViewById(R.id.txt11_location);
        txt11_web=findViewById(R.id.txt11_web);
        l11=findViewById(R.id.l11);
        l11.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

//        ------------------------------------------------------------------------------------------


        txt1_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0711211656";
                opendial(number);
            }
        });

        txt1_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=NVTI Vantharmoolai");
                openmap(uri);
            }
        });

        txt1_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt1_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//      --------------------------------------------------------------------------------------------

        txt2_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710318797";
                opendial(number);
            }
        });

        txt2_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=VTA VTC Ondachchimadam");
                openmap(uri);
            }
        });

        txt2_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt2_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt3_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138796";
                opendial(number);
            }
        });

        txt3_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=VTA VTC Kaluwanchikudy");
                openmap(uri);
            }
        });

        txt3_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt3_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt4_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138804";
                opendial(number);
            }
        });

        txt4_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=VTA VTC Vellavely");
                openmap(uri);
            }
        });

        txt4_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt4_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt5_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138797";
                opendial(number);
            }
        });

        txt5_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=Community Building,Paddipalai");
                openmap(uri);
            }
        });

        txt5_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt5_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt6_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138798";
                opendial(number);
            }
        });

        txt6_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=VTA VTC Kattankudy");
                openmap(uri);
            }
        });

        txt6_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt6_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt7_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138795";
                opendial(number);
            }
        });

        txt7_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=VTA VTC Arayampathy");
                openmap(uri);
            }
        });

        txt7_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt7_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt8_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710138805";
                opendial(number);
            }
        });

        txt8_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=Korakallimadu Sri Ramana Maharishi School");
                openmap(uri);
            }
        });

        txt8_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt8_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt9_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0713018802";
                opendial(number);
            }
        });

        txt9_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=Vocational Training Center, Valaichenenai");
                openmap(uri);
            }
        });

        txt9_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt9_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt10_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710318806";
                opendial(number);
            }
        });

        txt10_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=Vocational Training Center, Vaharai");
                openmap(uri);
            }
        });

        txt10_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt10_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

        txt11_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0710318802";
                opendial(number);
            }
        });

        txt11_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("geo:0, 0?q=Vocational Training Institute, Vavunatheevu");
                openmap(uri);
            }
        });

        txt11_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri=Uri.parse("https://www.ict5.lk/");
                openweb(uri);
            }
        });

        txt11_av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ndict.this , courses.class);
                startActivity(intent);
            }
        });

//        ------------------------------------------------------------------------------------------

    }

    public void expand1(View view) {

        int v = (txt1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt1_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt1_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt1_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt1_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt1_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l1,new AutoTransition());
        txt1.setVisibility(v);

        txt1_av.setVisibility(v);
        txt1_web.setVisibility(v);
        txt1_phone.setVisibility(v);
        txt1_location.setVisibility(v);
        txt1_con.setVisibility(v);



    }

    public void expand2(View view) {
        int v = (txt2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt2_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt2_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt2_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt2_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt2_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;


        TransitionManager.beginDelayedTransition(l2,new AutoTransition());
        txt2.setVisibility(v);

        txt2_av.setVisibility(v);
        txt2_web.setVisibility(v);
        txt2_phone.setVisibility(v);
        txt2_location.setVisibility(v);
        txt2_con.setVisibility(v);

    }

    public void expand3(View view) {

        int v = (txt3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt3_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt3_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt3_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt3_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt3_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l3,new AutoTransition());
        txt3.setVisibility(v);

        txt3_av.setVisibility(v);
        txt3_web.setVisibility(v);
        txt3_phone.setVisibility(v);
        txt3_location.setVisibility(v);
        txt3_con.setVisibility(v);

    }

    public void expand4(View view) {

        int v = (txt4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt4_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt4_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt4_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt4_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt4_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l4,new AutoTransition());
        txt4.setVisibility(v);

        txt4_av.setVisibility(v);
        txt4_web.setVisibility(v);
        txt4_phone.setVisibility(v);
        txt4_location.setVisibility(v);
        txt4_con.setVisibility(v);
    }

    public void expand5(View view) {

        int v = (txt5.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt5_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt5_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt5_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt5_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt5_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l5,new AutoTransition());
        txt5.setVisibility(v);

        txt5_av.setVisibility(v);
        txt5_web.setVisibility(v);
        txt5_phone.setVisibility(v);
        txt5_location.setVisibility(v);
        txt5_con.setVisibility(v);
    }

    public void expand6(View view) {

        int v = (txt6.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v1 = (txt6_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt6_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt6_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt6_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt6_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l6,new AutoTransition());
        txt6.setVisibility(v);

        txt6_av.setVisibility(v);
        txt6_web.setVisibility(v);
        txt6_phone.setVisibility(v);
        txt6_location.setVisibility(v);
        txt6_con.setVisibility(v);
    }

    public void expand7(View view) {

        int v = (txt7.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt7_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt7_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt7_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt7_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt7_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l7,new AutoTransition());
        txt7.setVisibility(v);

        txt7_av.setVisibility(v);
        txt7_web.setVisibility(v);
        txt7_phone.setVisibility(v);
        txt7_location.setVisibility(v);
        txt7_con.setVisibility(v);
    }

    public void expand8(View view) {

        int v = (txt8.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt8_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt8_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt8_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt8_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt8_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l8,new AutoTransition());
        txt8.setVisibility(v);

        txt8_av.setVisibility(v);
        txt8_web.setVisibility(v);
        txt8_phone.setVisibility(v);
        txt8_location.setVisibility(v);
        txt8_con.setVisibility(v);
    }

    public void expand9(View view) {

        int v = (txt9.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt9_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt9_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt9_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt9_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt9_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l9,new AutoTransition());
        txt9.setVisibility(v);

        txt9_av.setVisibility(v);
        txt9_web.setVisibility(v);
        txt9_phone.setVisibility(v);
        txt9_location.setVisibility(v);
        txt9_con.setVisibility(v);
    }

    public void expand10(View view) {

        int v = (txt10.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt10_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt10_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt10_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt10_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt10_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;


        TransitionManager.beginDelayedTransition(l10,new AutoTransition());
        txt10.setVisibility(v);

        txt10_av.setVisibility(v);
        txt10_web.setVisibility(v);
        txt10_phone.setVisibility(v);
        txt10_location.setVisibility(v);
        txt10_con.setVisibility(v);
    }

    public void expand11(View view) {

        int v = (txt11.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        int v1 = (txt11_av.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v2= (txt11_con.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v3 = (txt11_location.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v4 = (txt11_phone.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        int v5 = (txt11_web.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;

        TransitionManager.beginDelayedTransition(l11,new AutoTransition());
        txt11.setVisibility(v);

        txt11_av.setVisibility(v);
        txt11_web.setVisibility(v);
        txt11_phone.setVisibility(v);
        txt11_location.setVisibility(v);
        txt11_con.setVisibility(v);
    }

    private void opendial(String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+ this.number));
        startActivity(intent);
    }

    private void openmap(Uri uri) {
//        Uri uri=Uri.parse("geo:0, 0?q=NVTI Vantharmoolai");
//     Uri uri = Uri.parse("geo:7.787492,81.581306");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openweb(Uri uri) {
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}