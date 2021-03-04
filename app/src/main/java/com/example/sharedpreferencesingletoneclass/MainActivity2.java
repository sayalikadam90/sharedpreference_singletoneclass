package com.example.sharedpreferencesingletoneclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtfname,txtlname,txtemail;
    Button btnlogout;

    SharedPreference sharedPreference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sharedPreference=new SharedPreference(this);

        txtfname=findViewById(R.id.txtfname);
        txtlname=findViewById(R.id.txtlname);
        txtemail=findViewById(R.id.txtemail);

        btnlogout=findViewById(R.id.btnlogout);


        txtfname.setText(sharedPreference.getFirstName());
        txtlname.setText(sharedPreference.getLastName());
        txtemail.setText(sharedPreference.getEmail());



        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPreference.setIslogin(false);
                finish();

            }
        });
    }
}