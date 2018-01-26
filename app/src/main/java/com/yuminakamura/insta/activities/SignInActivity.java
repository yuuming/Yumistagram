package com.yuminakamura.insta.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yuminakamura.insta.R;

public class SignInActivity extends AppCompatActivity {

    private EditText usernameEdit, passwordEdit;
    private Button signinBTN,signupBTN;
    private String usernameString, passwordString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signinBTN = (Button)findViewById(R.id.sign_in);
        signupBTN = (Button)findViewById(R.id.sign_up);

//        usernameString = String.valueOf(usernameEdit.getText());
//        passwordString = String.valueOf(passwordEdit.getText());

        signinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,TimelineActivity.class);
                startActivity(intent);
            }
        });

        signupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

    }
}
