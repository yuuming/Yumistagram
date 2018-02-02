package com.yuminakamura.insta.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yuminakamura.insta.R;


public class RegisterActivity extends AppCompatActivity {

    EditText username, email, password, confirmPassword;
    Button signUpBTN;
    private String usernameString, emailString, passwordString,confirmpassString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText)findViewById(R.id.resister_username);
        email = (EditText)findViewById(R.id.resister_email);
        password = (EditText)findViewById(R.id.register_password);
        confirmPassword = (EditText)findViewById(R.id.register_confirm);
        signUpBTN = (Button)findViewById(R.id.register_sign_up);

        usernameString = String.valueOf(username.getText());
        emailString = String.valueOf(email.getText());
        passwordString = String.valueOf(password.getText());
        confirmpassString = String.valueOf(confirmPassword.getText());

        signUpBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,TimelineActivity.class);
                startActivity(intent);
            }
        });

    }
}
