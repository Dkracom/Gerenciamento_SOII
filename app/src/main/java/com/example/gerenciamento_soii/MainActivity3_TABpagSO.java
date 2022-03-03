package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.text.DecimalFormat;

import java.util.ArrayList;

public class MainActivity3_TABpagSO extends AppCompatActivity {

    ListView tabpag;
    Double percmem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3__t_a_bpag_s_o);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle params = intent.getExtras();
            if (params != null) {
                int[] tabpagSO = params.getIntArray("tabpagSO");
                Integer qpl = params.getInt("qpl");
                Integer memtotal = params.getInt("memtotal");
                Integer auxSO = params.getInt("auxSO");
                Integer auxfragint = params.getInt("auxfragint");
                Double fragInt = params.getDouble("fragInt");

                percmem = (double)memtotal/auxSO;
                percmem = percmem * 100.0;
                DecimalFormat df = new DecimalFormat("#,###.00");
                tabpag = (ListView) findViewById(R.id.list01);
                ArrayList<String> tabela = preencherDados(tabpagSO, qpl);

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabela);
                tabpag.setAdapter(arrayAdapter);

                TextView texto1 = findViewById(R.id.textView3);
                texto1.setText("Memória Disponível: "+memtotal+" Bytes - "+df.format(percmem)+"%\n"+"Fragmentação Interna: "+auxfragint+" Bytes - "+fragInt+"%");//ARRUMAR DOIS ZEROS APOS VIRGULA
            }
        }
    }

    private ArrayList<String> preencherDados(int[] tabpagSO, Integer qpl) {
        ArrayList<String> dados = new ArrayList<String>();
        Integer aux = 0;
        while (aux < qpl){
            dados.add(aux+"     |     "+tabpagSO[aux]);
            aux++;
        }
        return dados;
    }
}