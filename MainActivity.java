package com.example.obcroma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,add2;
    TextView t4;

    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button);
        add2 = (Button) findViewById(R.id.button2);
        t4 = (TextView) findViewById(R.id.textView4) ;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = e1.getText().toString();
                String n2 = e2.getText().toString();
                float num1,num2;
                num1 = Float.parseFloat(n1);
                num2 = Float.parseFloat(n2);
                float sum = num1 + num2;
                String sum1 = Float.toString(sum);
                t4.setText(sum1);
            }
        });
       add2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s1 = t4.getText().toString();
               int numb = Integer.parseInt(s1);
               String str;
               int flag = 0;
               for(int i=2;i<numb;i++)
               {
                   if(numb%i==0)
                   {
                       flag = 1;
                       break;
                   }
               }
               if(flag==0)
               {
                    str = "Prime";
               }
               else
               {
                    str = "Non-Prime";
               }
               Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
               intent.putExtra("Ch",str);
               startActivity(intent);
           }

       });
    }
}
