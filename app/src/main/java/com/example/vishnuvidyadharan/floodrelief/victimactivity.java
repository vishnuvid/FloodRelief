package com.example.vishnuvidyadharan.floodrelief;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class victimactivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victimactivity);

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        List<String> catagories1 = new ArrayList<>();
        catagories1.add(0, "select needs");
        catagories1.add("food packet");
        catagories1.add("soap");
        catagories1.add("napkin");
        catagories1.add("water bottle");
        catagories1.add("paste");
        catagories1.add("clothes");
        catagories1.add("bleaching powder");
        catagories1.add("blanket");
        catagories1.add("food packet");
        catagories1.add("food packet");
        catagories1.add("food packet");
        catagories1.add("food packet");

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories1);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2 = (Spinner) findViewById(R.id.spinner2);

        List<String> catagories2 = new ArrayList<>();
        catagories2.add(0, "select needs");
        catagories2.add("food packet");
        catagories2.add("soap");
        catagories2.add("napkin");
        catagories2.add("water bottle");
        catagories2.add("paste");
        catagories2.add("clothes");
        catagories2.add("bleaching powder");
        catagories2.add("blanket");
        catagories2.add("food packet");
        catagories2.add("food packet");
        catagories2.add("food packet");
        catagories2.add("food packet");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories2);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3 = (Spinner) findViewById(R.id.spinner3);

        List<String> catagories3 = new ArrayList<>();
        catagories3.add(0, "select needs");
        catagories3.add("food packet");
        catagories3.add("soap");
        catagories3.add("napkin");
        catagories3.add("water bottle");
        catagories3.add("paste");
        catagories3.add("clothes");
        catagories3.add("bleaching powder");
        catagories3.add("blanket");
        catagories3.add("food packet");
        catagories3.add("food packet");
        catagories3.add("food packet");
        catagories3.add("food packet");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories3);

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner3.setAdapter(adapter3);

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4 = (Spinner) findViewById(R.id.spinner4);

        List<String> catagories4 = new ArrayList<>();
        catagories4.add(0, "select needs");
        catagories4.add("food packet");
        catagories4.add("soap");
        catagories4.add("napkin");
        catagories4.add("water bottle");
        catagories4.add("paste");
        catagories4.add("clothes");
        catagories4.add("bleaching powder");
        catagories4.add("blanket");
        catagories4.add("food packet");
        catagories4.add("food packet");
        catagories4.add("food packet");
        catagories4.add("food packet");

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories4);

        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adapter4);

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5 = (Spinner) findViewById(R.id.spinner5);

        List<String> catagories5 = new ArrayList<>();
        catagories5.add(0, "select needs");
        catagories5.add("food packet");
        catagories5.add("soap");
        catagories5.add("napkin");
        catagories5.add("water bottle");
        catagories5.add("paste");
        catagories5.add("clothes");
        catagories5.add("bleaching powder");
        catagories5.add("blanket");
        catagories5.add("food packet");
        catagories5.add("food packet");
        catagories5.add("food packet");
        catagories5.add("food packet");

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories5);

        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner5.setAdapter(adapter5);

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner6 = (Spinner) findViewById(R.id.spinner6);

        List<String> catagories6 = new ArrayList<>();
        catagories6.add(0, "select needs");
        catagories6.add("food packet");
        catagories6.add("soap");
        catagories6.add("napkin");
        catagories6.add("water bottle");
        catagories6.add("paste");
        catagories6.add("clothes");
        catagories6.add("bleaching powder");
        catagories6.add("blanket");
        catagories6.add("food packet");
        catagories6.add("food packet");
        catagories6.add("food packet");
        catagories6.add("food packet");

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, catagories6);

        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner6.setAdapter(adapter6);

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemvalue = parent.getItemAtPosition(position).toString();

                Toast.makeText(victimactivity.this, "Selected"+ itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
