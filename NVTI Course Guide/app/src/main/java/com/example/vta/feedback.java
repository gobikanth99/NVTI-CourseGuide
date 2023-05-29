package com.example.vta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class feedback extends AppCompatActivity {

    private EditText txt1, txt2;
    TextInputLayout txtl1, txtl2;
    Button btn1;

    String sub, mess, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        txt1 = findViewById(R.id.textlayoutinput);
        txt2 = findViewById(R.id.textlayoutinput2);

        txtl1 = findViewById(R.id.textlayout);
        txtl2 = findViewById(R.id.textlayout2);

        btn1 = findViewById(R.id.button1);

        email="dvtbatticoloa@vtasl.gov.lk";

        txt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                sub = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mess = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(feedback.this, sub+" "+mess, Toast.LENGTH_SHORT).show();
                openmail(email, sub, mess);
            }
        });
    }

    public void openmail(String email, String sub, String mess) {
        if (txt1.length() == 0) {
            txtl1.setError("Enter The Message Title");
            txt1.setError("Enter The Message Title");
        } else {
            if (txt2.length() == 0) {
                txtl2.setError("Enter The Message");
                txt2.setError("Enter The Message Title");
            } else {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email});
                intent.putExtra(Intent.EXTRA_SUBJECT,sub);
                intent.putExtra(Intent.EXTRA_TEXT,mess);
//                        intent.setType("message/rfc822");
//                        intent.setPackage("com.google.android.gm");

                try {
                    startActivity(Intent.createChooser(intent,"Choose The Mailer"));
                }
                catch (Exception e) {
                    Toast.makeText(feedback.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}