package com.example.vishnuvidyadharan.floodrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registeractivity extends AppCompatActivity {
    private Button victim;
    private Button camp;
    private Button donate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);
        victim = (Button) findViewById(R.id.victim);
        camp = (Button) findViewById(R.id.camp);
        donate = (Button) findViewById(R.id.donate);
        victim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent vic= new Intent(registeractivity.this,victimactivity.class);
                startActivity(vic);
            }
        });

        camp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log=new Intent(registeractivity.this,campofficeractivity.class);
                startActivity(log);
            }
        });

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent don= new Intent(registeractivity.this,donateactivity.class);
                startActivity(don);
            }
        });
    }
}
