package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class courses extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22;
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        txt1=findViewById(R.id.txt1);
        l1=findViewById(R.id.l1);
        b1=findViewById(R.id.b1);
        l1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        txt2=findViewById(R.id.txt2);
        l2=findViewById(R.id.l2);
        b2=findViewById(R.id.b2);
        l2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt3=findViewById(R.id.txt3);
        l3=findViewById(R.id.l3);
        b3=findViewById(R.id.b3);
        l3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt4=findViewById(R.id.txt4);
        l4=findViewById(R.id.l4);
        b4=findViewById(R.id.b4);
        l4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt5=findViewById(R.id.txt5);
        l5=findViewById(R.id.l5);
        b5=findViewById(R.id.b5);
        l5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt6=findViewById(R.id.txt6);
        l6=findViewById(R.id.l6);
        b6=findViewById(R.id.b6);
        l6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt7=findViewById(R.id.txt7);
        l7=findViewById(R.id.l7);
        b7=findViewById(R.id.b7);
        l7.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt8=findViewById(R.id.txt8);
        l8=findViewById(R.id.l8);
        b8=findViewById(R.id.b8);
        l8.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt9=findViewById(R.id.txt9);
        l9=findViewById(R.id.l9);
        b9=findViewById(R.id.b9);
        l9.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt10=findViewById(R.id.txt10);
        l10=findViewById(R.id.l10);
        b10=findViewById(R.id.b10);
        l10.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt11=findViewById(R.id.txt11);
        l11=findViewById(R.id.l11);
        b11=findViewById(R.id.b11);
        l11.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt12=findViewById(R.id.txt12);
        l12=findViewById(R.id.l12);
        b12=findViewById(R.id.b12);
        l1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt13=findViewById(R.id.txt13);
        l13=findViewById(R.id.l13);
        b13=findViewById(R.id.b13);
        l13.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt14=findViewById(R.id.txt14);
        l14=findViewById(R.id.l14);
        b14=findViewById(R.id.b14);
        l14.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt15=findViewById(R.id.txt15);
        l15=findViewById(R.id.l15);
        b15=findViewById(R.id.b15);
        l15.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt16=findViewById(R.id.txt16);
        l16=findViewById(R.id.l16);
        b16=findViewById(R.id.b16);
        l16.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt17=findViewById(R.id.txt17);
        l17=findViewById(R.id.l17);
        b17=findViewById(R.id.b17);
        l17.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt18=findViewById(R.id.txt18);
        l18=findViewById(R.id.l18);
        b18=findViewById(R.id.b18);
        l18.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt19=findViewById(R.id.txt19);
        l19=findViewById(R.id.l19);
        b19=findViewById(R.id.b19);
        l19.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt20=findViewById(R.id.txt20);
        l20=findViewById(R.id.l20);
        b20=findViewById(R.id.b20);
        l20.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt21=findViewById(R.id.txt21);
        l21=findViewById(R.id.l21);
        b21=findViewById(R.id.b21);
        l21.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        txt22=findViewById(R.id.txt22);
        l22=findViewById(R.id.l22);
        b22=findViewById(R.id.b22);
        l22.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openweb();
            }
        });


    }

    public void expand(View view) {

        int v = (txt1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l1,new AutoTransition());
        txt1.setVisibility(v);

        int v1 = (b1.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b1.setVisibility(v1);
    }

    public void expand2(View view) {

        int v = (txt2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l2,new AutoTransition());
        txt2.setVisibility(v);

        int v1 = (b2.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b2.setVisibility(v1);
    }

    public void expand3(View view) {

        int v = (txt3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l3,new AutoTransition());
        txt3.setVisibility(v);

        int v1 = (b3.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b3.setVisibility(v1);
    }

    public void expand4(View view) {

        int v = (txt4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l4,new AutoTransition());
        txt4.setVisibility(v);

        int v1 = (b4.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b4.setVisibility(v1);
    }

    public void expand5(View view) {

        int v = (txt5.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l5,new AutoTransition());
        txt5.setVisibility(v);

        int v1 = (b5.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b5.setVisibility(v1);
    }

    public void expand6(View view) {

        int v = (txt6.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l6,new AutoTransition());
        txt6.setVisibility(v);

        int v1 = (b6.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b6.setVisibility(v1);
    }

    public void expand7(View view) {

        int v = (txt7.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l7,new AutoTransition());
        txt7.setVisibility(v);

        int v1 = (b7.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b7.setVisibility(v1);
    }

    public void expand8(View view) {

        int v = (txt8.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l8,new AutoTransition());
        txt8.setVisibility(v);

        int v1 = (b8.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b8.setVisibility(v1);
    }

    public void expand9(View view) {

        int v = (txt9.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l9,new AutoTransition());
        txt9.setVisibility(v);

        int v1 = (b9.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b9.setVisibility(v1);
    }

    public void expand10(View view) {

        int v = (txt10.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l10,new AutoTransition());
        txt10.setVisibility(v);

        int v1 = (b10.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b10.setVisibility(v1);
    }

    public void expand11(View view) {

        int v = (txt11.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l11,new AutoTransition());
        txt11.setVisibility(v);

        int v1 = (b11.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b11.setVisibility(v1);
    }

    public void expand12(View view) {

        int v = (txt12.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l12,new AutoTransition());
        txt12.setVisibility(v);

        int v1 = (b12.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b12.setVisibility(v1);
    }

    public void expand13(View view) {

        int v = (txt13.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l13,new AutoTransition());
        txt13.setVisibility(v);

        int v1 = (b13.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b13.setVisibility(v1);
    }

    public void expand14(View view) {

        int v = (txt14.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l14,new AutoTransition());
        txt14.setVisibility(v);

        int v1 = (b14.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b14.setVisibility(v1);
    }

    public void expand15(View view) {

        int v = (txt15.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l15,new AutoTransition());
        txt15.setVisibility(v);

        int v1 = (b15.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b15.setVisibility(v1);
    }

    public void expand16(View view) {

        int v = (txt16.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l16,new AutoTransition());
        txt16.setVisibility(v);

        int v1 = (b16.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b16.setVisibility(v1);
    }

    public void expand17(View view) {

        int v = (txt17.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l17,new AutoTransition());
        txt17.setVisibility(v);

        int v1 = (b17.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b17.setVisibility(v1);
    }

    public void expand18(View view) {

        int v = (txt18.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l18,new AutoTransition());
        txt18.setVisibility(v);

        int v1 = (b18.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b18.setVisibility(v1);
    }

    public void expand19(View view) {

        int v = (txt19.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l19,new AutoTransition());
        txt19.setVisibility(v);

        int v1 = (b19.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b19.setVisibility(v1);
    }

    public void expand20(View view) {

        int v = (txt20.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l20,new AutoTransition());
        txt20.setVisibility(v);

        int v1 = (b20.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b20.setVisibility(v1);
    }

    public void expand21(View view) {

        int v = (txt21.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l21,new AutoTransition());
        txt21.setVisibility(v);

        int v1 = (b21.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b21.setVisibility(v1);
    }

    public void expand22(View view) {
        int v = (txt22.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(l21,new AutoTransition());
        txt22.setVisibility(v);

        int v1 = (b22.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
        b22.setVisibility(v1);
    }

    private void openweb() {

        Uri uri=Uri.parse("https://www.ict5.lk/registration.php");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}