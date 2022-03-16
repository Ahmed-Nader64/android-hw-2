package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nam = findViewById(R.id.name);
        TextView age = findViewById(R.id.Age1);
        TextView jop = findViewById(R.id.jop_view);
        TextView phone = findViewById(R.id.Phone_number1);
        TextView email = findViewById(R.id.Email1);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("data");
        int age1 = bundle.getInt("data1");
        String jop1 = bundle.getString("data2");
        int phone1 = bundle.getInt("data3");
        String email1 = bundle.getString("data4");

        nam.setText(""+name);
        age.setText(""+age1);
        jop.setText(""+phone1);
        phone.setText(""+jop1);
        email.setText(""+email1);
    }
}