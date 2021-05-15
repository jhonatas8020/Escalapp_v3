package com.example.escalapp_v3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.escalapp_v3.activity.Activity_list_atividades;
import com.example.escalapp_v3.model.Atividades;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

     @Override
      protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

      BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

      bottomNavigationView.setSelectedItemId(R.id.homeFragment);

      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
              switch (item.getItemId()){
                  case R.id.homeFragment:
                      return true;
                  case R.id.folgasFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,folgas.class));
                      overridePendingTransition(0,0);
                      return true;
                  case R.id.tarefasFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,Activity_list_atividades.class));
                      overridePendingTransition(0,0);
                      return true;
                  case R.id.maisFragment:
                      startActivity(new Intent(getApplicationContext()
                              ,mnAdmActivity.class));
                      overridePendingTransition(0,0);
                      return true;
              }
              return false;
          }
      });

     }
}