package org.example.composite;

public class SistemaArquivos {

    public static void main(String[] args) {
        Arquivo foto = new ArquivoPng("foto");
        Arquivo texto = new ArquivoTxt("documento");
        
        Pasta imagens = new Pasta("Imagens");
        imagens.adicionaItem(foto);

        Pasta documentos = new Pasta("Documentos");
        documentos.adicionaItem(texto);

        Pasta raiz = new Pasta("Meu Computador");
        raiz.adicionaItem(imagens);
        raiz.adicionaItem(documentos);
        raiz.abrir();

    }
}
