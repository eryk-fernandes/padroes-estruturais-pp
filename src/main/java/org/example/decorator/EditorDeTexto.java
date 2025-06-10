package org.example.decorator;

public class EditorDeTexto {

    public static void main(String[] args) {

        String conteudo = "Padrões de projeto.";
        TextoSimples texto = new TextoSimples(conteudo);

        System.out.println(texto.formata());

        TextoNegrito textoNegrito = new TextoNegrito(conteudo);
        System.out.println(conteudo);

        TextoItalico textoItalico = new TextoItalico(conteudo);
        System.out.println(textoItalico.formata());

    }
}
