package com.renansn.hotelpim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CriarContaSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta_sc);

        Button cadastroButton = (Button) findViewById(R.id.btnCadastro);
        cadastroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CriarContaSc.this, ConfirmarEmail.class));
            }
        });

        TextView loginTv = (TextView) findViewById(R.id.tvLogin);
        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CriarContaSc.this, MainActivity.class));
            }
        });
    }
}