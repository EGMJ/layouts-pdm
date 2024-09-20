package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class balaio extends AppCompatActivity {

    private Button btnCalcular;

    private EditText edtConsumo;
    private EditText edtCouvert;
    private EditText edtConta;

    private EditText edtTaxa;
    private EditText edtTotal;
    private EditText edtPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_balaio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        
        
        btnCalcular = findViewById(R.id.btnCalcular);
        edtConsumo = findViewById(R.id.edtConsumo);
        edtCouvert = findViewById(R.id.edtCouvert);
        edtConta = findViewById(R.id.edtConta);
        edtTaxa = findViewById(R.id.edtTaxa);
        edtTotal = findViewById(R.id.edtTotal);
        edtPessoa = findViewById(R.id.edtPessoa);
        
        edtTaxa.setEnabled(false);
        edtTotal.setEnabled(false);
        edtPessoa.setEnabled(false);
        
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double consumo = Double.parseDouble(edtConsumo.getText().toString());
                double couvert = Double.parseDouble(edtCouvert.getText().toString());
                int qtdPessoas = Integer.parseInt(edtConta.getText().toString());
                double taxa = (consumo + couvert) * 0.1;
                double total = consumo + taxa + couvert;
                edtTaxa.setText(String.format("%.2f", taxa));
                edtTotal.setText(String.format("%.2f", total));
                edtPessoa.setText(String.format("%.2f", total/qtdPessoas));
            }
        });
    }
}