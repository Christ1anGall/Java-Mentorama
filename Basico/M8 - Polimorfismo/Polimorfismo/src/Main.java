package src;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(2, 2, "Banco do Brasil", 35000.00, 1000.50, null);
        ContaSalario cs1 = new ContaSalario(3, 3, "Banco do Brasil", 5000.00);
        ContaPoupanca cp1 = new ContaPoupanca(4, 2, "Banco do Brasil", 25000.00, 20, 4.8);
        ContaCorrente cc2 = new ContaCorrente(2, 2, "Banco do Brasil", 35000.00, 3000.50, null);
        ContaCorrente cc3 = new ContaCorrente(2, 2, "Banco do Brasil", 35000.00, 0, null);

        List<ContaCorrente> contas = Arrays.asList(cc1, cc2, cc3);

        for (ContaCorrente contaCorrente : contas) {
            System.out.println(contaCorrente);
        }

        Cliente cli1 = new Cliente("Christian", true, "123456", 9);
        Cliente cli2 = new Cliente("Nicolas", true, "123456", 81);
        Cliente cli3 = new Cliente("Nathalia", true, "123456", 71);
        Cliente cli4 = new Cliente("Lucas", true, "123456", 50);
        Cliente cli5 = new Cliente("Isabela", true, "123456", 30);
        Cliente cli6 = new Cliente("Mariana", true, "123456", 15);
        Cliente cli7 = new Cliente("Ricardo", true, "123456", 5);

        cli1.autentica("123456");

        List<Cliente> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7);

        clientes.stream()
                .filter(cli -> cli.getCompras() >= 20)
                .map(Cliente::getCompras)
                .forEach(System.out::println);

        // Cliente com mais compras
        Cliente clienteMaisCompras = clientes.stream()
                .max(Comparator.comparingInt(Cliente::getCompras))
                .orElse(null);
        System.out.println("Cliente com mais compras: " + clienteMaisCompras);

        // Cliente com menos compras
        Cliente clienteMenosCompras = clientes.stream()
                .min(Comparator.comparingInt(Cliente::getCompras))
                .orElse(null);
        System.out.println("Cliente com menos compras: " + clienteMenosCompras);

        // Média de compras
        OptionalDouble mediaCompras = clientes.stream()
                .mapToInt(Cliente::getCompras)
                .average();
        if (mediaCompras.isPresent()) {
            System.out.println("Média de compras: " + mediaCompras.getAsDouble());
        }
    }
}