package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.Age1);
        EditText jop = findViewById(R.id.jop_view);
        EditText phone = findViewById(R.id.Phone_number1);
        EditText email = findViewById(R.id.Email1);

        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                int a = Integer.parseInt(age.getText().toString());
                String j = jop.getText().toString();
                int p = Integer.parseInt(phone.getText().toString());
                String e = email.getText().toString();

                Toast.makeText(MainActivity.this,"" + n,Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,"" + a ,Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,"" + j ,Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,"" + p ,Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,"" + p ,Toast.LENGTH_LONG);

                i.putExtra("data",n);
                i.putExtra("data1",a);
                i.putExtra("data2",j);
                i.putExtra("data3",p);
                i.putExtra("data4",e);

                startActivity(i);
            }
        });
    }
}