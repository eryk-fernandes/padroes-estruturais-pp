package org.example.decorator;

public class TextoSimples {

    private String conteudo;

    public TextoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    public String formata() {
        return conteudo;
    }
}
