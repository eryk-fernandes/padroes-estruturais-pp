package org.example.decorator;

public class TextoSimples implements Texto {

    public TextoSimples() {

    }

    @Override
    public String formatar(String conteudo) {
        return conteudo;
    }
}
