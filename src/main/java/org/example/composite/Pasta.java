package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pasta implements Arquivo {

    private String nome;
    private List<Arquivo> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionaItem(Arquivo item){
        itens.add(item);
    }

    public void abrir(){
        System.out.println("Pasta: " + nome);
        for (Arquivo item : itens){
            item.abrir();
        }
    }

}
