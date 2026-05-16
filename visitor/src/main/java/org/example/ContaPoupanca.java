package org.example;

public class ContaPoupanca implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double rendimento;

    public ContaPoupanca(int numero, String titular, double saldo, double rendimento) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.rendimento = rendimento;
    }

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public double getRendimento() { return rendimento; }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContaPoupanca(this);
    }
}
