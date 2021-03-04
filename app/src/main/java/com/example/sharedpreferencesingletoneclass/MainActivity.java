package com.example.sharedpreferencesingletoneclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreference sharedPreference;
    EditText edtfname,edtlname,edtemail;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreference=new SharedPreference(this);

        edtfname=findViewById(R.id.fname);
        edtlname=findViewById(R.id.lname);
        edtemail=findViewById(R.id.email);

        btnlogin=findViewById(R.id.btnlogin);



        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreference.setFirstName(edtfname.getText().toString().trim());
                sharedPreference.setLastName(edtlname.getText().toString().trim());
                sharedPreference.setEmail(edtemail.getText().toString().trim());
                sharedPreference.setIslogin(true);

                 Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                 startActivity(intent);
            }
        });
    }
}