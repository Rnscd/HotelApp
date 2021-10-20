package com.renansn.hotelpim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuartosDisponiveis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartos_disponiveis);


        Button reservarButton = (Button) findViewById(R.id.btnReservar);
        reservarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuartosDisponiveis.this, ConfirmacaoReserva.class));
            }
        });

        Button reservarButton2 = (Button) findViewById(R.id.btnReservar2);
        reservarButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuartosDisponiveis.this, ConfirmacaoReserva.class));
            }
        });

        Button reservarButton3 = (Button) findViewById(R.id.btnReservar3);
        reservarButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuartosDisponiveis.this, ConfirmacaoReserva.class));
            }
        });

    }
}