package org.example.bridge;

public class EmissorEmail implements Emissor {

    @Override
    public void emitir() {
        System.out.println("Enviando por EMAIL...");
    }

}
