package org.example.bridge;

public class NotaFiscalEmail {

    public void emitir(String cliente, double valor){
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        System.out.println("Enviando por EMAIL...");
    }
}
