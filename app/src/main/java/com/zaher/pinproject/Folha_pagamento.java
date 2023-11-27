package com.zaher.pinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Folha_pagamento extends AppCompatActivity {
    private Button bntExit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folha_pagamento);
        bntExit2 = findViewById(R.id.bntExit2);

        bntExit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(Folha_pagamento.this,Tela_funcoes.class);
                startActivity(Intent);
            }
        });
    }
}