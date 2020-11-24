package com.example.prova_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.storage.FirebaseStorage;

public class MainActivity extends AppCompatActivity {
    FirebaseStorage storage = FirebaseStorage.getInstance("CustomApp");
    private ListView Listagem;
    private EditText n;
    private EditText i;
    private Pessoa_Info Pessoa;
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Listagem=findViewById(R.id.Listview);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.cp_Nome);
        i=findViewById(R.id.cp_Idade);
        atualizalistagem();
    }
    public void salvar(View view){
        Pessoa.setNome(n.getText().toString());
        Pessoa.setIdade(Integer.parseInt(i.getText().toString()));
        Dao.SalvarDao(Pessoa);
        atualizalistagem();
    }
    public void atualizalistagem(){
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item, Dao.getPessoa());
        Listagem.setAdapter(adapter);
    }
}