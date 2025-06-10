package org.example.decorator;

public class TextoItalico extends TextoSimples {
    public TextoItalico(String conteudo) {
        super(conteudo);
    }

    @Override
    public String formata() {
        return "<i>" + super.formata() + "</i>";    }
}
