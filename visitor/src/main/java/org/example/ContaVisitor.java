package org.example;

public class ContaVisitor implements Visitor {

    public String exibir(Conta conta) {
        return conta.aceitar(this);
    }

    public String exibirContaCorrente(ContaCorrente conta) {
        return "ContaCorrente{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + "'" +
                ", saldo=" + conta.getSaldo() +
                ", limite=" + conta.getLimite() +
                "}";
    }

    public String exibirContaPoupanca(ContaPoupanca conta) {
        return "ContaPoupanca{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + "'" +
                ", saldo=" + conta.getSaldo() +
                ", rendimento=" + conta.getRendimento() +
                "}";
    }

    public String exibirContaSalario(ContaSalario conta) {
        return "ContaSalario{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + "'" +
                ", saldo=" + conta.getSaldo() +
                ", empresa='" + conta.getEmpresa() + "'" +
                "}";
    }
}
