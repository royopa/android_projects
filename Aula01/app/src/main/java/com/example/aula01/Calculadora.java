package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Ligacao dos componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
                // Soma e armazenamento do resultado.
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 + num2;
                // retorno do resultado para a interface gráfica
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Ligação dos componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
                // Subtração e armazenamento do resultado.
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 - num2;
                // retorno do resultado para a interface gráfica
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        Button btnMultiplicarProg = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Ligacao dos componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
                // Multiplicação e armazenamento do resultado.
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 * num2;
                // retorno do resultado para a interface gráfica
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);
        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Ligação dos componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);
                // Divisão e armazenamento do resultado.
                double num1 = Double.parseDouble(edtValor1Prog.getText().toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText().toString());
                double resultado = num1 / num2;
                // retorno do resultado para a interface gráfica
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
    }
}