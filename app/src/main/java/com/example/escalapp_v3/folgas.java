package com.example.escalapp_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.model.Atividades;

public class folgas extends AppCompatActivity {

    // Estrutura para navegar entre telas

    Button btnHome, btnFolga, btnTarefas, btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //homeFragment, folgasFragment... foram criados para navegação usando Fragment mas deu errado, porem recliclei os id criados para declarar aqui
        btnHome = (Button) findViewById(R.id.homeFragment);
        btnFolga = (Button) findViewById(R.id.folgasFragment);
        btnTarefas = (Button) findViewById(R.id.tarefasFragment);
        btnMenu = (Button) findViewById(R.id.maisFragment);
    }

    //Aqui eu coloco o comando que seria (activity onde estamos).this e depois a activity que queremos abrir
    public void BtnHome(View v){
        Intent in = new Intent(folgas.this, MainActivity.class);
        startActivity(in);
    }

    public void BtnTarefas(View v){
        Intent in = new Intent(folgas.this, Atividades.class);
        startActivity(in);
    }

    public void BtnMenu(View v){
        Intent in = new Intent(folgas.this, mnFuncionario.class);
        startActivity(in);
    }
}