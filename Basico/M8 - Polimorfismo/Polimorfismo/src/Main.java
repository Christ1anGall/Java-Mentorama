package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 1, "Banco do Brasil", 25000.00);
        System.out.println(c1);

        ContaCorrente cc1 = new ContaCorrente(2, 2, "Banco do Brasil", 35000.00, 1000.50, null);

        System.out.println(cc1);
        System.out.println("O Saldo da CC é :" + cc1.getSaldo());

        ContaSalario cs1 = new ContaSalario(3, 3, "Banco do Brasil", 5000.00);

        System.out.println(cs1);
        System.out.println("O Saldo da CS é :" + cs1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca(4, 2, "Banco do Brasil", 25000.00, 20, 4.8);

        System.out.println(cp1);
        System.out.println("O Saldo da CP é :" + cp1.getSaldo());

        List<Conta> contas = List.of(c1, cc1, cs1, cp1);
    }
}
