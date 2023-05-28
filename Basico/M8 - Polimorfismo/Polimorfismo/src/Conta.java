package src;

public abstract class Conta {

    private Integer numero;
    private Integer agencia;
    private String banco;
    protected Double saldo;

    public Conta(int numero, int agencia, String banco, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {
        return 0.0;
    }

    public abstract void depositar(Double valor);

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", agencia=" + agencia + ", banco=" + banco + ", saldo=" + saldo + "]";
    }

}
