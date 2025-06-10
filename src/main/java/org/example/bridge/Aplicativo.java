package org.example.bridge;

public class Aplicativo {

    public static void main(String[] args) {

        NotaFiscal notaFiscal = new NotaFiscal("Maria José", 1200.00, new EmissorEmail());
        notaFiscal.emitir();

        notaFiscal.setEmissor(new EmissorImpressora());
        notaFiscal.emitir();

        NotaFiscal notaFiscal1 = new NotaFiscal("João José", 942.00, new EmissorImpressora());
        notaFiscal1.emitir();

        notaFiscal1.setEmissor(new EmissorEmail());
        notaFiscal1.emitir();


    }
}
