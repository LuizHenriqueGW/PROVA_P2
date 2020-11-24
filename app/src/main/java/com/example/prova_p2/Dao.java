package com.example.prova_p2;

import java.util.ArrayList;
import java.util.List;

public class Dao extends Pessoa_Info{
    private static List<Pessoa_Info> dados = new ArrayList<>();

    public static void SalvarDao(Pessoa_Info elemento){
        dados.add(elemento);
    }
    public static List<Pessoa_Info> getPessoa(){
        return dados;
    }
}
