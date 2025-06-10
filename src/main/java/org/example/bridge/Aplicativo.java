package org.example.bridge;

public class Aplicativo {

    public static void main(String[] args) {
        NotaFiscalEmail notaFiscalEmail = new NotaFiscalEmail();
        notaFiscalEmail.emitir("Maria José", 1200.00);

        NotaFiscalImpressora notaFiscalImpressora = new NotaFiscalImpressora();
        notaFiscalImpressora.emitir("João José", 942.00);
    }
}
