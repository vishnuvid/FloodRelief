package com.example.vishnuvidyadharan.floodrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Logregactivity extends AppCompatActivity {
    private Button register;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logregactivity2);
        register = (Button) findViewById(R.id.register);
        login = (Button) findViewById(R.id.login);
        register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                Intent inte = new Intent(Logregactivity.this,registeractivity.class);
                startActivity(inte);

             }

        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log=new Intent(Logregactivity.this,loginactivity.class);
                startActivity(log);
            }
        });



    }

}
