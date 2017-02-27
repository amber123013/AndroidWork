package com.example.asus.firstwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String textUserName = bundle.getString("textUserName");
        String textPassWord = bundle.getString("textPassWord");
        String textRadioButton = bundle.getString("textRadioButton");
        String textAddress = bundle.getString("textAddress");
        String textSchool = bundle.getString("textSchool");

        TextView showUsername = (TextView) findViewById(R.id.show_username);
        showUsername.setText("您的账户为： " + textUserName);
        TextView showPassword = (TextView) findViewById(R.id.show_password);
        showPassword.setText("您的密码为： " + textPassWord);
        TextView showSex = (TextView) findViewById(R.id.show_sex);
        showSex.setText("您的性别为： " + textRadioButton);
        TextView showAddress = (TextView) findViewById(R.id.show_address);
        showAddress.setText("您的地址为： " + textAddress);
        TextView showSchool = (TextView) findViewById(R.id.show_school);
        showSchool.setText("您的学校为： " + textSchool);
    }
}
