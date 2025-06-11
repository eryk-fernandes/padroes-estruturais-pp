package org.example.decorator;

public class TextoItalico extends TextoDecorador {

    public TextoItalico(Texto texto) {
        super(texto);
    }

    @Override
    public String formatar(String conteudo) {
        return "<i>" + super.formatar(conteudo) + "</i>";
    }

}
