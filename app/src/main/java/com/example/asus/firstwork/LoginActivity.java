package com.example.asus.firstwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userName,passWord;
    String textPassWord;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        bundle = intent.getExtras();
        String textUserName = bundle.getString("textUserName");
        textPassWord = bundle.getString("textPassWord");
        String textRadioButton = bundle.getString("textRadioButton");
        userName = (EditText) findViewById(R.id.login_username);
        userName.setText(textUserName);
        passWord = (EditText) findViewById(R.id.login_password);
        passWord.requestFocus();
        Button submit = (Button) findViewById(R.id.login);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(passWord.getText().toString().trim().equals(textPassWord)) {
                    Intent intent = new Intent(LoginActivity.this,ShowMessageActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this,"密码输入错误！",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passWord.setText("");
            }
        });
    }
}
