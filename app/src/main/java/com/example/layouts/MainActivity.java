package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void TelaPoupanca(View view){
        Intent it = new Intent(this, Poupanca.class);
        startActivity(it);
    }

    public void TelaTransito(View view){
        Intent it = new Intent(this, Transito.class);
        startActivity(it);
    }

    public void TelaPizzaria(View view){
        Intent it = new Intent(this, Pizzaria.class);
        startActivity(it);
    }

    public void TelaRestaurante(View view){
        Intent it = new Intent(this, balaio.class);
        startActivity(it);
    }
    
    public void Sair(View view){
        finish();
    }
}