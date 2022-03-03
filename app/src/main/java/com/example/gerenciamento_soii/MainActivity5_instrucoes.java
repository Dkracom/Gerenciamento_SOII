package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5_instrucoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_instrucoes);

        TextView texto1 = findViewById(R.id.textView18);
        texto1.setText("As instruções dessa aplicação são simples. Primeiramente escolha o tamanho da página em Bytes, logo após isso será direcionado para o menu, o qual possui as seguintes opções:\n"
                +"- Criar Processo - Insira com o tamanho em Bytes e o conteúdo (char).\n"+"- Destruir Processo - Insira o PID do processo que deseja destruir.\n"+"- Mostrar Tabela de Página (SO) - Exibe a tabela de página do Sistema Operacional.\n"+"- Mostrar Tabela de Página (Processo) - Insira o PID do processo que deseja exibir a tabela.\n"+"- Encerra - encerra a aplicação na configuração atual.\n");
    }
    public void voltar(View view){
        Intent i = new Intent(MainActivity5_instrucoes.this, MainActivity.class);
        startActivity(i);
    }
}