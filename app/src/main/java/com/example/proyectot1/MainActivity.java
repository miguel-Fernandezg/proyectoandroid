package com.example.proyectot1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
String[] MercanciasSolidas={"ladrillos","semento","arena"};
    String[] ProductosAgricolas={"bultos","graneles"};
    String[] MercanciaLiquida={"agua","gasolina","gaseosas"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
    }
}