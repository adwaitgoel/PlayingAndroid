package com.example.obcroma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText re1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        re1 = (EditText) findViewById(R.id.editText3);
        String str1;
        Intent i = getIntent();
        str1 = i.getExtras().getString("ch");
        re1.setText(str1);
    }
}
