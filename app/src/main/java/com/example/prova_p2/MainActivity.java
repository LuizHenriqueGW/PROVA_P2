package com.example.prova_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText n;
    private EditText i;
    private Dao Pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.cp_Nome);
        i=findViewById(R.id.cp_Idade);
    }
    public void salvar(View view){
        Pessoa.setNome(n.getText().toString());
        Pessoa.setIdade(Integer.parseInt(i.getText().toString()));
    }
}