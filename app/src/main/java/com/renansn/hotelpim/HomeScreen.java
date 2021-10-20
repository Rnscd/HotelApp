package com.renansn.hotelpim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        Button reservaButton = (Button) findViewById(R.id.btnReserva);
        reservaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, FiltroReserva.class));
            }
        });

        Button checarButton = (Button) findViewById(R.id.btnChecar);
        checarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, ChecarReserva.class));
            }
        });

        TextView sairTv = (TextView) findViewById(R.id.tvSair);
        sairTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreen.this, MainActivity.class));
            }
        });
    }
}