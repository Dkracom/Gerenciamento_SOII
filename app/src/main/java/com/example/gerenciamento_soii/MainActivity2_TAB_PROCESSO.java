package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2_TAB_PROCESSO extends AppCompatActivity {

    ListView tabpag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2__t_a_b__p_r_o_c_e_s_s_o);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle params = intent.getExtras();
            if (params != null) {
                int[] pidProcesso1 = params.getIntArray("pidProcesso1");
                Integer nproc = params.getInt("nproc");
                Integer memtotal = params.getInt("memtotal");
                Integer tampSO = params.getInt("tampSO");
                Integer ocipag = params.getInt("ocipag");
                Integer qpl = params.getInt("qpl");
                Integer pidInf = params.getInt("pidInf");
                Double fragInt = params.getDouble("fragInt");

                TextView texto1 = findViewById(R.id.textView12);
                texto1.setText("Tamanho do Processo: "+memtotal+" Bytes\n"+"Páginas ocupadas pelo Processo: "+nproc+" - "+(nproc*tampSO)+" Bytes \n"+"Ociosidade na última Página: "+ocipag+" Bytes - "+fragInt+"%");

                tabpag = (ListView) findViewById(R.id.list01);
                ArrayList<String> tabela = preencherDados(pidProcesso1, qpl,pidInf);

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabela);
                tabpag.setAdapter(arrayAdapter);
            }
        }
    }
    private ArrayList<String> preencherDados(int[] pidProcesso1, Integer qpl, Integer pidInf) {
        ArrayList<String> dados = new ArrayList<String>();
        Integer aux = 0;
        Integer aux2 = 0;
        while (aux < qpl){
            if (pidProcesso1[aux] == pidInf){
                dados.add(aux2+"     |     "+aux);
                aux2++;
            }
            aux++;
        }
        return dados;
    }
}