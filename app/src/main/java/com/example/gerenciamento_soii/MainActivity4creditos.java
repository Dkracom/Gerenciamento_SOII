package com.example.gerenciamento_soii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;

public class MainActivity4creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity4creditos);
    }

    public void voltar(View view){
        Intent i = new Intent(MainActivity4creditos.this, MainActivity.class);
        startActivity(i);
    }

}