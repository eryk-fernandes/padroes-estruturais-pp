package org.example.decorator;

public abstract class TextoDecorador implements Texto {

    private Texto texto;

    public TextoDecorador(Texto texto) {
        this.texto = texto;
    }

    public String formatar(String conteudo) {
        return conteudo;
    }

}
