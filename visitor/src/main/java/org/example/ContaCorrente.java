package org.example;

public class ContaCorrente implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public double getLimite() { return limite; }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContaCorrente(this);
    }
}
