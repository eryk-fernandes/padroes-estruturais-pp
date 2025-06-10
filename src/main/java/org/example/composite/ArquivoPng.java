package org.example.composite;

public class ArquivoPng implements Arquivo {

    String nome;

    public ArquivoPng(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.printf("Abrindo %s.png\n", nome);
    }

}
