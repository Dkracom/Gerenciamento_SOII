package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2Menu extends AppCompatActivity {

    public static final int CONSTANT_TELA3 = 1;
    public static final int CONSTANT_TELA4 = 1;
    Integer qpl1,tamprocatual,pidSO,pidInf,auxcp,tampSO,aux,auxSO,totalpagSO=0,aux2,auxmemdisp,auxfragint, memtotal, tamproc, nproc, ocipag;
    int[] tabpagSO1, tamMemProcesso1, lugarTabGeral1;
    int[] pidProcesso1;
    double fragInt;
    EditText texto;
    Button cp, dp, pgso, tabpagpro, encerra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_menu);


        Intent intent = getIntent();
        if (intent != null) {
            Bundle params = intent.getExtras();
            if (params != null) {
                Integer tamp = params.getInt("tamp");
                Integer ml = params.getInt("ml");
                Integer desloc = params.getInt("desloc");
                Integer qpl = params.getInt("qpl");
                Integer el = params.getInt("el");
                Integer npl = params.getInt("npl");
                Integer pid = params.getInt("pid");
                int[] tabpagSO = params.getIntArray("tabpagSO");
                int[] pidProcesso = params.getIntArray("pidProcesso");
                int[] tamMemProcesso = params.getIntArray("tamMemProcesso");
                int[] lugarTabGeral = params.getIntArray("lugarTabGeral");

                qpl1 = qpl;
                tabpagSO1 = tabpagSO;
                pidProcesso1 = pidProcesso;
                tamMemProcesso1 = tamMemProcesso;
                lugarTabGeral1 = lugarTabGeral;
                pidSO = pid;
                tampSO = tamp;
                        TextView texto1 = findViewById(R.id.textView6);
                texto1.setText("Gerenciamento por Paginação (MF = ML)\n"+"Memória: 8 KB - Endereços 13 bits - Páginas de "+tamp+" B\n"+"Número de Páginas com: "+npl+" Bits\n"+"_____________________________________________________");
            }

        }

        cp = (Button) findViewById(R.id.button);//CRIAR PROCESSO
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tamprocatual = null;
                texto = (EditText) findViewById(R.id.editTextCP);
                tamprocatual = Integer.valueOf(texto.getText().toString());
                    aux=tamprocatual;
                    for (auxcp = 0; tampSO <= aux;auxcp++){ //DEFINE QUANTAS PAGINAS VAI OCUPAR
                        aux = aux - tampSO;
                    }

                    if ((aux > 0) && (aux < tampSO)){
                        auxcp = auxcp + 1;
                    }
                    //AUXCP N PAGINAS DO PROCESSO
                    aux = qpl1 - totalpagSO;
                    if (auxcp > aux){
                        Toast.makeText(MainActivity2Menu.this, "Número de Páginas Insuficiente", Toast.LENGTH_SHORT).show();
                    }else {
                        aux = 0;
                        auxSO = 0;
                        aux2 = tamprocatual;
                        while (aux < auxcp){
                            if (tabpagSO1[auxSO] == 0) {
                                tabpagSO1[auxSO] = 1;
                                pidProcesso1[auxSO] = pidSO;
                                if (aux2 < tampSO){//separa os valores para calculo de fragemantacao interna
                                    tamMemProcesso1[auxSO] = aux2;
                                }else {
                                    tamMemProcesso1[auxSO] = tampSO;
                                    aux2 = aux2 - tampSO;
                                }

                                aux++;
                            } else {
                                auxSO++;
                            }
                        }
                        totalpagSO = totalpagSO + auxcp;
                        Toast.makeText(MainActivity2Menu.this, "Processo criado com sucesso! PID "+ pidSO, Toast.LENGTH_SHORT).show();
                        pidSO = pidSO + 1;
                    }
            }
        });

        dp = (Button) findViewById(R.id.button2);//DESTRUIR PROCESSO
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto = (EditText) findViewById(R.id.editTextDP);
                pidInf = Integer.valueOf(texto.getText().toString());
                auxSO = 0;
                for(aux = 0; aux < qpl1;aux++){
                    if (pidProcesso1[aux] == pidInf){
                        pidProcesso1[aux] = 0;
                        tamMemProcesso1[aux] = 0;
                        tabpagSO1[aux] = 0;
                        totalpagSO = totalpagSO - 1;
                        auxSO++;
                    }
                }
                if ((auxSO < 1) || (pidInf == 0)){
                    Toast.makeText(MainActivity2Menu.this, "PID Inválido!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity2Menu.this, "Processo destruído com sucesso! PID "+ pidInf, Toast.LENGTH_SHORT).show();
                }
            }

        });
        pgso = (Button) findViewById(R.id.button3);//MOSTRA PAGINA SO
        pgso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calculo memoria disponivel e fragmentacao interna SO
                auxmemdisp = 0;
                auxfragint = 0;
                memtotal = qpl1 * tampSO;
                auxSO = qpl1 * tampSO;
                for (aux = 0; aux < qpl1;aux++){
                    auxmemdisp = auxmemdisp + tamMemProcesso1[aux];
                    if (tamMemProcesso1[aux] != tampSO){
                        auxfragint = auxfragint + tamMemProcesso1[aux];
                    }
                }
                memtotal = memtotal - auxmemdisp;
                fragInt = (double)auxfragint / (tampSO * qpl1);
                fragInt = fragInt * 100.0;
                Bundle params = new Bundle();
                params.putInt("qpl", qpl1);
                params.putInt("memtotal", memtotal);
                params.putInt("auxSO", auxSO);
                params.putInt("auxfragint", auxfragint);
                params.putDouble("fragInt", fragInt);
                params.putIntArray("tabpagSO", tabpagSO1);
                Intent i = new Intent(MainActivity2Menu.this, MainActivity3_TABpagSO.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA3);
            }

        });
        tabpagpro = (Button) findViewById(R.id.button4);// MOSTRA PAGINA PROCESSO
        tabpagpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto = (EditText) findViewById(R.id.editTextNome5);
                pidInf = Integer.valueOf(texto.getText().toString());
                tamproc = 0;
                memtotal = 0;
                nproc = 0;
                fragInt = 0.0;
                ocipag = 0;
                for (aux = 0; aux < qpl1;aux++){
                    if (pidProcesso1[aux] == pidInf){
                        memtotal = memtotal +tamMemProcesso1[aux];
                        nproc = nproc + 1;
                        if (tamMemProcesso1[aux] < tampSO){//IDENTIFICA OCIOSIDADE NA ULTIMA PAGINA
                            ocipag = tamMemProcesso1[aux];
                        }
                    }
                }
                if (ocipag > 0){// SE SIM EXISTE FRAGMENTACAO INTERNA
                    fragInt = (double)ocipag / tampSO;
                    fragInt = fragInt * 100.0;
                }

                Bundle params = new Bundle();
                params.putInt("qpl", qpl1);
                params.putInt("pidInf", pidInf);
                params.putInt("memtotal", memtotal);//tamanho do processo
                params.putInt("nproc", nproc);//paginas ocupadas pelo processo
                params.putInt("tampSO", tampSO);//tamanho pagina SO
                params.putInt("ocipag", ocipag);//ociosidade ultima pagina
                params.putDouble("fragInt", fragInt);//calculo fragmentacao
                params.putIntArray("pidProcesso1", pidProcesso1);
                Intent i = new Intent(MainActivity2Menu.this, MainActivity2_TAB_PROCESSO.class);
                i.putExtras(params);
                startActivityForResult(i, CONSTANT_TELA4);


            }

        });

        encerra = (Button) findViewById(R.id.button5);
        encerra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2Menu.this, "SO Encerrado com sucesso!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity2Menu.this, MainActivity.class);
                startActivity(i);
            }

        });

    }
}

