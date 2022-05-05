package com.example.arreglomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner = (Spinner) findViewById(R.id.spnSpinner);
    }

    public void distritos(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this,R.array.distritos, android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
    }

    public void anexos(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this,R.array.anexos, android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
    }

    public void atras(View view) {
        Intent atras = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(atras);
    }
}