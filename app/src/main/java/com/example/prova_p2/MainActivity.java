package com.example.prova_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {
    FirebaseStorage storage = FirebaseStorage.getInstance("CustomApp");
    private EditText n;
    private EditText i;
    private Pessoa_Info Pessoa;
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
        Dao.SalvarDao(Pessoa);
    }
}