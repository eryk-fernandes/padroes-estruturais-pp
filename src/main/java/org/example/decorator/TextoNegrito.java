package org.example.decorator;

public class TextoNegrito extends TextoSimples {
    public TextoNegrito(String conteudo) {
        super(conteudo);
    }

    @Override
    public String formata() {
        return "<b>" + super.formata() + "</b>";    }
}
