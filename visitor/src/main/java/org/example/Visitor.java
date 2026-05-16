package org.example;

public interface Visitor {

    String exibirContaCorrente(ContaCorrente conta);
    String exibirContaPoupanca(ContaPoupanca conta);
    String exibirContaSalario(ContaSalario conta);
}
