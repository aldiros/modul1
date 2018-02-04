package com.example.aldiros.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Abnormal extends AppCompatActivity {

        TextView tvRestoran, tvMenumakan, tvPorsi, tvHarga;
        String restoran, menu;
        int porsi, harga;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_abnormal);
            tvRestoran = (TextView) findViewById(R.id.tv_restoran);
            tvMenumakan = (TextView) findViewById(R.id.tv_menumakan);
            tvPorsi = (TextView) findViewById(R.id.tv_porsi);
            tvHarga = (TextView) findViewById(R.id.tv_harga);

            Intent intent = getIntent();
            restoran = intent.getStringExtra("restaurant");
            menu = intent.getStringExtra("menu");
            porsi = intent.getIntExtra("porsi", 0);
            harga = intent.getIntExtra("harga", 0);

            tvRestoran.setText(restoran);
            tvMenumakan.setText(menu);
            tvPorsi.setText("" + porsi);
            tvHarga.setText("Rp." + harga);

            Toast toast = null; //inisiasi
            if (harga < 65000) {
                toast = Toast.makeText(getApplicationContext(), "Uangnya cukup", Toast.LENGTH_SHORT);
            } else {
                toast = Toast.makeText(getApplicationContext(), "Uangnya ga cukup", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

