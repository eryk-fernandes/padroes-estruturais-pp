package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pasta {

    private String nome;
    private List<Object> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionaItem(Object item){
        itens.add(item);
    }

    public void listaConteudo(){
        System.out.println("Pasta: " + nome);
        for (Object item: itens){
            if(item instanceof Arquivo){
                ((Arquivo) item).abrir();
            } else if (item instanceof Pasta) {
                ((Pasta) item).listaConteudo();
            }
        }
    }
}
