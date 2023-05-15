package src;

public class ContaSalario extends Conta {

    private static final int LIMITE_SAQUES = 2;
    private int numSaquesRealizados;

    public ContaSalario(int numero, int agencia, String banco, Double saldo) {
        super(numero, agencia, banco, saldo);
        this.numSaquesRealizados = 0;
    }

    @Override
    public Double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para saque deve ser maior que zero.");
        }
        if (this.numSaquesRealizados >= LIMITE_SAQUES) {
            throw new IllegalStateException("Limite de saques diários atingido.");
        }
        if (valor > this.getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= valor;
        this.numSaquesRealizados++;
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor para depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }
}
