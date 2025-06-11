package org.example.decorator;

public class EditorDeTexto {

    public static void main(String[] args) {

        String conteudo = "Padrões de projeto";

        Texto texto = new TextoSimples();
        System.out.println(texto.formatar(conteudo));

        Texto textoNegrito = new TextoNegrito(new TextoSimples());
        System.out.println(textoNegrito.formatar(conteudo));

        Texto textoItalico = new TextoItalico(new TextoSimples());
        System.out.println(textoItalico.formatar(conteudo));

        Texto textoSublinhado = new TextoSublinhado(new TextoSimples());
        System.out.println(textoSublinhado.formatar(conteudo));

    }
}
