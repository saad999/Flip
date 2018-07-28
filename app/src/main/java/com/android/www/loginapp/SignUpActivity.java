package com.android.www.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    TextView sginup,emailsu,passsu,mobilesu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sginup=(TextView)findViewById(R.id.Signup);
        emailsu=(TextView)findViewById(R.id.emailsu);
        passsu=(TextView)findViewById(R.id.passu);
        mobilesu=(TextView)findViewById(R.id.mobsu);



        Intent intent =this.getIntent();
        String mailad=intent.getExtras().getString("email").trim();
        String password=intent.getExtras().getString("pass").trim();
        String num=intent.getExtras().getString("mobile").trim();

        emailsu.setText(mailad);
        passsu.setText(password);
        mobilesu.setText(num);

        sginup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this,"Congratulations, you have signed up ",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent =new Intent(SignUpActivity.this,MainActivity.class);
        startActivity(intent);

        super.onBackPressed();
    }
}
