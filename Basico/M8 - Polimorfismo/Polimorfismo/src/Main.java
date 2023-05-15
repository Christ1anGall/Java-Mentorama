package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Conta c1 = new Conta(1, 1, "Banco do Brasil", 25000.00);
        // System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(2, 2, "Banco do Brasil", 35000.00, 1000.500, null);

        System.out.println(cc1);

        System.out.println("O Saldo da CC é :" + cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(1, 2, "Banco do Brasil", 25000.00, 20, 4.8);

        System.out.println(cp1);

        List<Conta> contas = List.of(cc1, cp1);
    }
}
