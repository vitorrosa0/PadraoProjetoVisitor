package org.example;

public class ContaSalario implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private String empresa;

    public ContaSalario(int numero, String titular, double saldo, String empresa) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.empresa = empresa;
    }

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public String getEmpresa() { return empresa; }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContaSalario(this);
    }
}
