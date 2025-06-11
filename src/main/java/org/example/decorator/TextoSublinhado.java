package org.example.decorator;

public class TextoSublinhado extends TextoDecorador {

    public TextoSublinhado(Texto texto) {
        super(texto);
    }

    @Override
    public String formatar(String conteudo) {
        return "<u>" + super.formatar(conteudo) + "</u>";
    }

}
