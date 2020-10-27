package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelefoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        //Ligação do componente da classe com os componentes da interface.
        Button btnVoltarMenu = (Button) findViewById(R.id.btnVoltarMenu2);

        btnVoltarMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Botão voltar clicado");
                Intent activity2Intent;
                activity2Intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(activity2Intent);
            }
        });

    }
}