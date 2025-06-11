package org.example.decorator;

public class TextoNegrito extends TextoDecorador {

    public TextoNegrito(Texto texto) {
        super(texto);
    }

    @Override
    public String formatar(String conteudo) {
        return "<b>" + super.formatar(conteudo) + "</b>";
    }
}
