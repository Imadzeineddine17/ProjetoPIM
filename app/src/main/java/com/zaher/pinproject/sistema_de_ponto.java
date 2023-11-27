package com.zaher.pinproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sistema_de_ponto extends AppCompatActivity {
    private Button bntRtrn1;
    public Button bntEntrada,bntRtn,bntSs,bntSt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_de_ponto);
        bntRtrn1 = findViewById(R.id.bntRtrn1);
        bntEntrada = findViewById(R.id.bntEntrada);
        bntSs = findViewById(R.id.bntSs);
        bntRtn = findViewById(R.id.bntRtn);
        bntSt = findViewById(R.id.btnSt);

        bntSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder Saida = new AlertDialog.Builder(sistema_de_ponto.this);
                Saida.setTitle("ATENÇÃO!!");
                Saida.setMessage("Ponto de saída do serviço registrado com sucesso");
                AlertDialog botaoEntrada = Saida.create();
                botaoEntrada.show();
            }
        });

        bntRtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder RetornoAlmoco = new AlertDialog.Builder(sistema_de_ponto.this);
                RetornoAlmoco.setTitle("ATENÇÃO!!");
                RetornoAlmoco.setMessage("Ponto de Retorno do almoço registrado com sucesso");
                AlertDialog botaoEntrada = RetornoAlmoco.create();
                botaoEntrada.show();
            }
        });

        bntSs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder SaidaAlmoco = new AlertDialog.Builder(sistema_de_ponto.this);
                SaidaAlmoco.setTitle("ATENÇÃO!!");
                SaidaAlmoco.setMessage("Ponto de saída para almoço registrado com sucesso");
                AlertDialog botaoEntrada = SaidaAlmoco.create();
                botaoEntrada.show();

            }
        });



        bntEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder Entrada = new AlertDialog.Builder(sistema_de_ponto.this);
                Entrada.setTitle("ATENÇÃO!!");
                Entrada.setMessage("Ponto de entrada do serviço registrado com sucesso");
                AlertDialog botaoEntrada = Entrada.create();
                botaoEntrada.show();
            }
        });

        bntRtrn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(sistema_de_ponto.this,Tela_funcoes.class);
                startActivity(Intent);
            }
        });
    }
}