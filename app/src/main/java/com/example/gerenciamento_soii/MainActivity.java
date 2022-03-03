package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    public static final int CONSTANT_TELA2 = 1;
    Integer ml, tamp, desloc, qpl, el, npl, aux,pid;
    Button dois, quatro, oito, um6, trinta2, sessenta4, cento28, duzentos56, quinhentos12, mil24, creditos, inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto1 = findViewById(R.id.textView1);
        texto1.setText("Gerenciamento por Paginação (MF = ML)\n"+"Tamanho da Memória 8 KB - Endereços com 13 bits \n"+"=> Informar o tamanho da página em Bytes:");

        dois = (Button) findViewById(R.id.button7);
        dois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //nomes = (EditText) findViewById(R.id.editTextNome);
                //npag = Integer.valueOf(nomes.getText().toString());
                tamp = 2;
                ml = 8;
                desloc = 1;
                qpl = 4096;
                el = 13;
                npl = 12;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        quatro = (Button) findViewById(R.id.button8);
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 4;
                ml = 8;
                desloc = 2;
                qpl = 2048;
                el = 13;
                npl = 11;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        oito = (Button) findViewById(R.id.button9);
        oito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 8;
                ml = 8;
                desloc = 3;
                qpl = 1024;
                el = 13;
                npl = 10;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        um6 = (Button) findViewById(R.id.button6);
        um6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 16;
                ml = 8;
                desloc = 4;
                qpl = 512;
                el = 13;
                npl = 9;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        trinta2 = (Button) findViewById(R.id.button10);
        trinta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 32;
                ml = 8;
                desloc = 5;
                qpl = 256;
                el = 13;
                npl = 8;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        sessenta4 = (Button) findViewById(R.id.button11);
        sessenta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 64;
                ml = 8;
                desloc = 6;
                qpl = 128;
                el = 13;
                npl = 7;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        cento28 = (Button) findViewById(R.id.button12);
        cento28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 128;
                ml = 8;
                desloc = 7;
                qpl = 64;
                el = 13;
                npl = 6;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        duzentos56 = (Button) findViewById(R.id.button13);
        duzentos56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 256;
                ml = 8;
                desloc = 8;
                qpl =32;
                el = 13;
                npl = 5;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        quinhentos12 = (Button) findViewById(R.id.button14);
        quinhentos12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 512;
                ml = 8;
                desloc = 9;
                qpl = 16;
                el = 13;
                npl = 4;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        mil24 = (Button) findViewById(R.id.button15);
        mil24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamp = 1024;
                ml = 8;
                desloc = 10;
                qpl = 8;
                el = 13;
                npl = 3;
                pid = 1;
                int[] tabpagSO = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    tabpagSO[aux]=0;
                }
                int pidProcesso[] = new int[qpl];
                int tamMemProcesso[] = new int[qpl];
                int lugarTabGeral[] = new int[qpl];
                for (aux = 0; aux < qpl; aux++){
                    pidProcesso[aux]=0;
                    tamMemProcesso[aux]=0;
                    lugarTabGeral[aux]=0;
                }
                Bundle params = new Bundle();
                //params.putInt("npag", npag);
                params.putInt("tamp", tamp);
                params.putInt("ml", ml);
                params.putInt("desloc", desloc);
                params.putInt("qpl", qpl);
                params.putInt("el", el);
                params.putInt("npl", npl);
                params.putInt("pid", pid);
                params.putIntArray("tabpagSO", tabpagSO);
                params.putIntArray("pidProcesso", pidProcesso);
                params.putIntArray("tamMemProcesso", tamMemProcesso);
                params.putIntArray("lugarTabGeral", lugarTabGeral);
                Intent i = new Intent(MainActivity.this, MainActivity2Menu.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA2);
            }
        });

        creditos = (Button) findViewById(R.id.button16);
        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity4creditos.class);
                startActivity(i);
            }
        });

        inst = (Button) findViewById(R.id.button17);
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity5_instrucoes.class);
                startActivity(i);
            }
        });
        }
    }