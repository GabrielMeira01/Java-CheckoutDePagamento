package com.example.checkoutpagamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_ValorCompra;
    private EditText edt_ValorCliente;
    private TextView txtv_Troco ;
    private TextView txtv_Brinde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_ValorCompra = findViewById(R.id.edt_ValorCompra);
        edt_ValorCliente = findViewById(R.id.edt_ValorCliente);
        txtv_Brinde = findViewById(R.id.txtv_Brinde);
        txtv_Troco = findViewById(R.id.txtv_Troco);
    }

    public void FinalizarCompra(View v){
        double valorCompra = Double.parseDouble(edt_ValorCompra.getText().toString());
        double valorCliente = Double.parseDouble(edt_ValorCliente.getText().toString());
        double valorTroco = valorCompra - valorCliente;

        txtv_Troco.setText("R$ " + valorTroco);

        if(valorCompra >= 100){
            txtv_Brinde.setText("SIM");
        }
        else{
            txtv_Brinde.setText("NÃO");
        }
    }
}