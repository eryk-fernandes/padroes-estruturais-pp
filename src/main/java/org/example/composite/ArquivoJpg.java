package org.example.composite;

public class ArquivoJpg implements Arquivo {

    String nome;

    public ArquivoJpg(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo %s.png\n", nome);
    }
}
