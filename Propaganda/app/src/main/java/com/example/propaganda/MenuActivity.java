package com.example.propaganda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Ligação do componente da classe com os componentes da interface.
        Button btnSobre = (Button) findViewById(R.id.btnSobre);

        btnSobre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Botão sobre clicado");
                Intent activity2Intent;
                activity2Intent = new Intent(getApplicationContext(), SobreActivity.class);
                startActivity(activity2Intent);
            }
        });

        Button btnTelefone = (Button) findViewById(R.id.btnTelefone);
        btnTelefone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Botão telefone clicado");
                Intent activity2Intent;
                activity2Intent = new Intent(getApplicationContext(), TelefoneActivity.class);
                startActivity(activity2Intent);
            }
        });
    }
}