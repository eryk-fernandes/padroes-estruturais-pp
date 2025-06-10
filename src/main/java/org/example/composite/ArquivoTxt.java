package org.example.composite;

public class ArquivoTxt implements Arquivo {

    String nome;

    public ArquivoTxt(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo %s.txt\n", nome);
    }
}
