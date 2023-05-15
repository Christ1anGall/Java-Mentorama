package src;

public class ContaCorrente extends Conta implements ITributos {

    private Double chequeEspecial;
    private Double limiteChequeEspecial;
    private Double taxaDeImposto = 0.01;

    public ContaCorrente(Integer numero, Integer agencia, String banco, Double saldo, Double chequeEspecial,
            Double limiteChequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente [chequeEspecial=" + chequeEspecial + ", limiteChequeEspecial=" + limiteChequeEspecial
                + "]";
    }

    @Override
    public Double getSaldo() {
        return this.saldo + this.chequeEspecial;
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para saque deve ser maior que zero.");
        }
        Double saldoDisponivel = this.getSaldo();
        if (saldoDisponivel == 0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        if (valor > saldoDisponivel) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        if (valor > this.saldo) {
            Double valorChequeEspecial = valor - this.saldo;
            if (valorChequeEspecial > this.limiteChequeEspecial) {
                throw new IllegalArgumentException("Valor do saque excede o limite do cheque especial.");
            }
            this.saldo = 0.0;
            this.chequeEspecial -= valorChequeEspecial;
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    @Override
    public Double calcularImposto() {
        return this.saldo * this.taxaDeImposto;
    }

}
