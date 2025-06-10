package org.example.bridge;

public class EmissorImpressora implements Emissor {

    @Override
    public void emitir() {
        System.out.println("Imprimindo localmente...");
    }
}
