package org.example.bridge;

public class NotaFiscal {

    private String cliente;
    private double valor;
    private Emissor emissor;

    public NotaFiscal(String cliente, double valor, Emissor emissor) {
        this.cliente = cliente;
        this.valor = valor;
        this.emissor = emissor;
    }

    public void emitir() {
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        emissor.emitir();
    }

    public Emissor getEmissor() {
        return emissor;
    }

    public void setEmissor(Emissor emissor) {
        this.emissor = emissor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void gerar() {

    }
}
