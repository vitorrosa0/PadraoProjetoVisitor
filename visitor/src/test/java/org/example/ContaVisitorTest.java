package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaVisitorTest {

    private ContaVisitor visitor = new ContaVisitor();

    @Test
    void deveExibirContaCorrente() {
        Conta conta = new ContaCorrente(1001, "João", 1500.0, 500.0);
        assertEquals("ContaCorrente{numero=1001, titular='João', saldo=1500.0, limite=500.0}",
                visitor.exibir(conta));
    }

    @Test
    void deveExibirContaPoupanca() {
        Conta conta = new ContaPoupanca(2001, "Maria", 3000.0, 0.5);
        assertEquals("ContaPoupanca{numero=2001, titular='Maria', saldo=3000.0, rendimento=0.5}",
                visitor.exibir(conta));
    }

    @Test
    void deveExibirContaSalario() {
        Conta conta = new ContaSalario(3001, "Pedro", 2000.0, "Acme");
        assertEquals("ContaSalario{numero=3001, titular='Pedro', saldo=2000.0, empresa='Acme'}",
                visitor.exibir(conta));
    }
}