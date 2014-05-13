package com.edib.fundamentalesandroid.app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MenuPrincipalActivity extends ListActivity {

    private String[] listaMenu = {"Calculadora", "Mapas", "SingleTouch", "MultiTouch", "PantallaCompleta", "AnyadirContacto", "Agenda", "SMS", "Persistencia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, this.listaMenu));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this.getApplicationContext(), "Posicion click: " + position + " id:" + id, Toast.LENGTH_SHORT).show();

        switch (position) {
            case 0:
                Intent intent = new Intent(this, CalculadoraActivity.class);
                this.startActivity(intent);

        }
    }
}
