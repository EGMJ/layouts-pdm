package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Transito extends AppCompatActivity {

    private TextView txtLista;
    private ImageView Placa;
    private Button btnOpc1,btnOpc2,btnOpc3,btnOpc4,btnProxima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transito);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtLista = findViewById(R.id.txtLista);
        Placa = findViewById(R.id.Placa);

        // View.OnClickListener listener = new View.OnClickListener() {
        //     @Override
        //     public void onClick(View view) {
        //         TrocarConteudo(view);
        //     };
        // };

        // btnOpc1.setOnClickListener(listener);
        // btnOpc2.setOnClickListener(listener);
        // btnOpc3.setOnClickListener(listener);
        // btnOpc4.setOnClickListener(listener);
        // btnProxima.setOnClickListener(listener);
    }

    public void TrocarConteudo(View view){
        if (view.getId() == R.id.btnCalcular) {
            txtLista.setText("Questão 1 de 5");
            Placa.setImageResource(R.drawable.logo_transito);

        } else if (view.getId() == R.id.btnOpc2) {
            txtLista.setText("Questão 2 de 5");
            Placa.setImageResource(R.drawable.placa_de_preferencia);

        } else if (view.getId() == R.id.btnOpc3) {
            txtLista.setText("Questão 3 de 5");
            Placa.setImageResource(R.drawable.placa_pare);

        }else if (view.getId() == R.id.btnOpc4) {
            txtLista.setText("Questão 4 de 5");
            Placa.setImageResource(R.drawable.placa_animal_na_pista);

        } else if (view.getId() == R.id.btnProxima) {
            txtLista.setText("Questão 5 de 5");
            Placa.setImageResource(R.drawable.placa_proibido_virar_a_esquerda);

        }
    }

    public void Voltar(View view){
        // Intent intent = new Intent(this, MainActivity.class);
        // startActivity(intent);
        finish();
    }

}