package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pizzaria extends AppCompatActivity {

    private Button btnDiminuir1, btnAumentar1, btnDiminuir2, btnAumentar2, btnDiminuir3, btnAumentar3,btnDiminuir4, btnAumentar4;
    private TextView QuantPizza1,QuantPizza2, QuantPizza3,QuantPizza4, txtTotal;
    private double totalValue = 0.00;
    
    private int quant1 = 0;
    private int quant2 = 0;
    private int quant3 = 0;
    private int quant4 = 0;
    
    private double preco1 = 29.99;  // Preço da Pizza 1
    private double preco2 = 39.99;  // Preço da Pizza 2
    private double preco3 = 29.99;  // Preço da Pizza 3
    private double preco4 = 49.99;  // Preço da Pizza 4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizzaria);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtTotal = (TextView) findViewById(R.id.txtTotal);
        txtTotal.setText(String.valueOf(totalValue));

//      para a primeira pizza
        btnDiminuir1 = findViewById(R.id.btnDiminuir1);
        btnAumentar1 = findViewById(R.id.btnAumentar1);
        QuantPizza1 = findViewById(R.id.QuantPizza1);
        QuantPizza1.setText(String.valueOf(quant1));

        btnAumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quant1++;  // Incrementa a quantidade
                QuantPizza1.setText(String.valueOf(quant1)); // Atualiza o valor exibido
                updateTotal();
            }
        });

        btnDiminuir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quant1 > 0) {  // Garante que não vá abaixo de zero
                    quant1--;
                    QuantPizza1.setText(String.valueOf(quant1)); // Atualiza o valor exibido
                    updateTotal();
                }
            }
        });



        //      para a segunda pizza
        btnDiminuir2 = findViewById(R.id.btnDiminuir2);
        btnAumentar2 = findViewById(R.id.btnAumentar2);
        QuantPizza2 = findViewById(R.id.QuantPizza2);
        QuantPizza2.setText(String.valueOf(quant2));

        btnAumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quant2++;  // Incrementa a quantidade
                QuantPizza2.setText(String.valueOf(quant2)); // Atualiza o valor exibido
                updateTotal();
            }
        });

        btnDiminuir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quant2 > 0) {  // Garante que não vá abaixo de zero
                    quant2--;
                    QuantPizza2.setText(String.valueOf(quant2)); // Atualiza o valor exibido
                    updateTotal();
                }
            }
        });



        //      para a terceira pizza
        btnDiminuir3 = findViewById(R.id.btnDiminuir3);
        btnAumentar3 = findViewById(R.id.btnAumentar3);
        QuantPizza3 = findViewById(R.id.QuantPizza3);
        QuantPizza3.setText(String.valueOf(quant3));

        btnAumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quant3++;  // Incrementa a quantidade
                QuantPizza3.setText(String.valueOf(quant3)); // Atualiza o valor exibido
                updateTotal();
            }
        });

        btnDiminuir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quant3 > 0) {  // Garante que não vá abaixo de zero
                    quant3--;
                    QuantPizza3.setText(String.valueOf(quant3)); // Atualiza o valor exibido
                    updateTotal();
                }
            }
        });


        //      para a quarta pizza
        btnDiminuir4 = findViewById(R.id.btnDiminuir4);
        btnAumentar4 = findViewById(R.id.btnAumentar4);
        QuantPizza4 = findViewById(R.id.QuantPizza4);
        QuantPizza4.setText(String.valueOf(quant4));

        btnAumentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quant4++;  // Incrementa a quantidade
                QuantPizza4.setText(String.valueOf(quant4)); // Atualiza o valor exibido
                updateTotal();
            }
        });

        btnDiminuir4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quant4 > 0) {  // Garante que não vá abaixo de zero
                    quant4--;
                    QuantPizza4.setText(String.valueOf(quant4)); // Atualiza o valor exibido
                    updateTotal();
                }
            }
        });

    }

    private void updateTotal() {

        totalValue = (quant1 * preco1) + (quant2 * preco2) + (quant3 * preco3) + (quant4 * preco4);
        txtTotal.setText(formatCurrency(totalValue));
    }

    private String formatCurrency(double value) {
        return String.format("R$ %.2f", value);
    }
}