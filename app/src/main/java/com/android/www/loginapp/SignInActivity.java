package com.android.www.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    TextView email,sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email=(TextView)findViewById(R.id.emailsi);
        sign=(TextView)findViewById(R.id.signin);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =email.getText().toString().trim();
                Toast.makeText(SignInActivity.this,"Welcome "+s,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
