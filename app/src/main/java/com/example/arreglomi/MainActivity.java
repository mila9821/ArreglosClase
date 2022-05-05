package com.example.arreglomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView LISTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LISTA = (ListView)findViewById(R.id.ltvLista);
    }



    public void siguiente(View view) {
        Intent siguiente = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(siguiente);
    }

    public void paises(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.paises, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

    public void departamentos(View view) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.departamentos, android.R.layout.simple_list_item_1);
        LISTA.setAdapter(adapter);
    }

}