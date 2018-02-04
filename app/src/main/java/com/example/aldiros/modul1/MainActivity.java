package com.example.aldiros.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMenumakan, etPorsi;
    Intent intent;
    String restoran, menu;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMenumakan = (EditText) findViewById(R.id.et_menumakan);
        etPorsi = (EditText) findViewById(R.id.et_porsi);
        intent = new Intent (this,Abnormal.class);
    }

    public void onEatbus(View view) {
        menu = etMenumakan.getText().toString();
        restoran = "Eatbus";
        porsi = Integer.parseInt(etPorsi.getText().toString());

        int total = 50000 * Integer.parseInt(etPorsi.getText().toString());
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant",restoran);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = etMenumakan.getText().toString();
        restoran = "Abnormal";
        porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 30000 * Integer.parseInt(etPorsi.getText().toString());
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant",restoran);
        intent.putExtra("menu",menu);
        intent.putExtra("posri",porsi);
        intent.putExtra("harga",total);
        startActivity(intent);
    }
}