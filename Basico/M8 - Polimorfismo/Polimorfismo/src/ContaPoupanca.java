package src;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private Integer diaAniversario;
    private Double taxaJuros;
    private Double saldoNoAniversario;

    public ContaPoupanca(int numero, int agencia, String banco, Double saldo, Integer diaAniversario,
            Double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
        this.saldoNoAniversario = saldo;
    }

    public Double getSaldo(int dia) {

        if (dia >= this.diaAniversario) {
            return this.saldo + this.taxaJuros * this.saldo;
        } else {
            return this.saldo;
        }
    }

    @Override
    public Double sacar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para saque deve ser maior que zero.");
        }
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        return this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para depósito deve ser maior que zero.");
        }

        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(hoje.getYear(), this.diaAniversario, hoje.getDayOfMonth());

        if (hoje.isEqual(aniversario) || hoje.isAfter(aniversario)) {
            // Adiciona os juros ao saldo no aniversário e atualiza a taxa de juros
            this.saldoNoAniversario = this.getSaldo();
            this.taxaJuros = this.taxaJuros + 0.01;
        }

        this.saldo += valor;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaPoupanca [diaAniversario=" + diaAniversario + ", taxaJuros=" + taxaJuros
                + ", saldoNoAniversario="
                + saldoNoAniversario + "]";
    }

}
