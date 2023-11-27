package com.zaher.pinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_funcoes extends AppCompatActivity {
    private Button bntSdp, bntFp, bntExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcoes);

        bntSdp = findViewById(R.id.bntSdp);
        bntFp = findViewById(R.id.bntFp);
        bntExit = findViewById(R.id.bntExit);

        bntExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(Tela_funcoes.this,MainActivity.class);
                startActivity(Intent);
            }
        });

        bntFp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(Tela_funcoes.this,Folha_pagamento.class);
                startActivity(Intent);
            }
        });

        bntSdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(Tela_funcoes.this,sistema_de_ponto.class);
                startActivity(Intent);
            }
        });


    }
}