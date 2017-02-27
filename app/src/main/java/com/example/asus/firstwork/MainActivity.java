package com.example.asus.firstwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText)findViewById(R.id.username);
        userName.postDelayed(new Runnable() {
            @Override
            public void run() {
                userName.setFocusable(true);
                userName.requestFocus();
                userName.setFocusableInTouchMode(true);
            }
        },500);
        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textUserName = userName.getText().toString().trim();
                EditText passWord = (EditText)findViewById(R.id.password);
                String textPassWord = passWord.getText().toString().trim();
                EditText address = (EditText) findViewById(R.id.address);
                String textAddress = address.getText().toString().trim();
                EditText school = (EditText) findViewById(R.id.school);
                String textSchool = school.getText().toString().trim();
                RadioGroup radioGroup = (RadioGroup)findViewById(R.id.iRadio);
                if("".equals(textUserName) || "".equals(textPassWord)) {
                    Toast.makeText(MainActivity.this,"用户名或密码为空！",Toast.LENGTH_SHORT).show();
                    return;
                }
                //获取选中项的id
                RadioButton radioButton = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                String textRadioButton = radioButton.getText().toString();
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                Bundle bundle =new Bundle();
                bundle.putString("textUserName",textUserName);
                bundle.putString("textPassWord",textPassWord);
                bundle.putString("textRadioButton",textRadioButton);
                bundle.putString("textAddress",textAddress);
                bundle.putString("textSchool",textSchool);
                intent.putExtras(bundle);
                startActivity(intent);
//                Toast.makeText(MainActivity.this,
//                          "您输入的用户名为： " + userName.getText()
//                        + "密码为： " + passWord.getText()
//                        + "性别为： " + radioButton.getText()
//                        , Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
//        EditText userName = (EditText)findViewById(R.id.username);
//        userName.setFocusable(true);
//        userName.requestFocus();
//        userName.setFocusableInTouchMode(true);
//        //userName.setText("434");
    }
}
