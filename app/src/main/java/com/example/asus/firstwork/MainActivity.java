package com.example.asus.firstwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userName = (EditText)findViewById(R.id.username);
                EditText passWord = (EditText)findViewById(R.id.password);
                RadioGroup radioGroup = (RadioGroup)findViewById(R.id.iRadio);
                //获取选中项的id
                RadioButton radioButton = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                Toast.makeText(MainActivity.this,
                          "您输入的用户名为： " + userName.getText()
                        + "密码为： " + passWord.getText()
                        + "性别为： " + radioButton.getText()
                        , Toast.LENGTH_SHORT).show();

            }
        });

    }

}
