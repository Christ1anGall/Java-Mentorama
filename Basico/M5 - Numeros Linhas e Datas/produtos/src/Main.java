package produtos.src;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import produtos.src.models.Produto;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("-----PEDIDO DE VENDAS------");

        int opt;

        do {
            System.out.println("1 - cadastrar produto");
            System.out.println("0 ----- sair");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Qual Operação você deseja realizar: ");

            opt = scanner.nextInt();

            process(opt);

        } while (opt != 0);

    }

    public static void process(int opt) throws Exception {
        switch (opt) {
            case 1: {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Qual a descrição do Produto ?");
                String descicao = scanner.nextLine();

                System.out.print("Qual o ID do Produto?");
                int id = scanner.nextInt();

                System.out.print("Qual o preço do Produto?");
                double preco = scanner.nextDouble();

                System.out.print("Qual a data da validade do Produto?");
                String dataString = scanner.next();
                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descicao, preco, dataValidade);
                /*
                 * novoProduto.setId(id);
                 * novoProduto.setDescricao(descicao);
                 */
                System.out.println("Produto Criado com Sucesso");
                System.out.println("---ID:  " + novoProduto.getId());
                System.out.println("---Descricao:  " + novoProduto.getDescricao());
                System.out.println("---preco:  " + novoProduto.getPreco());
                System.out.println("---Data de Validade:  " + novoProduto.getDate());
                System.out.println("--------------------------------------------");

            }
            case 0: {
                break;
            }
        }
    }

}
