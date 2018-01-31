package com.yuminakamura.insta.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yuminakamura.insta.R;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEdit, passwordEdit;
    private Button signinBTN,signupBTN;
    private String usernameString, passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signinBTN = (Button)findViewById(R.id.main_sign_in);
        signupBTN = (Button)findViewById(R.id.main_sign_up);

//        usernameString = String.valueOf(usernameEdit.getText());
//        passwordString = String.valueOf(passwordEdit.getText());

        signinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,TimelineActivity.class);
                startActivity(intent);
            }
        });

        signupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
