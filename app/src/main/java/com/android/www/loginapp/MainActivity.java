package com.android.www.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView con, email, pass, mobile, signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con = (TextView) findViewById(R.id.cont);
        email = (TextView) findViewById(R.id.email);
        pass = (TextView) findViewById(R.id.pass);
        mobile = (TextView) findViewById(R.id.mob);
        signin = (TextView) findViewById(R.id.signinc);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("pass", pass.getText().toString());
                intent.putExtra("mobile", mobile.getText().toString());
                startActivity(intent);
            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}
