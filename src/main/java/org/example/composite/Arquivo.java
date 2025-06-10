package org.example.composite;

public class Arquivo {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public void abrir(){
        System.out.println("Abrindo arquivo: " + nome);
    }
}
