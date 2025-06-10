package org.example.decorator;

public class TextoSublinhado extends TextoSimples {
    public TextoSublinhado(String conteudo) {
        super(conteudo);
    }

    @Override
    public String formata() {
        return "<u>" + super.formata() + "</u>";    }
}
