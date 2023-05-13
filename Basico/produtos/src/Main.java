package produtos.src;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import produtos.src.db.ProdutosDB;
import produtos.src.models.Produto;

public class Main {

    static ProdutosDB produtosDB = new ProdutosDB();

    public static void main(String[] args) throws Exception {

        System.out.println("-----PEDIDO DE VENDAS------");

        int opt;

        do {
            System.out.println("2 - Listar Produtos");
            System.out.println("1 - cadastrar Produto");
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

                produtosDB.setProdutoList(novoProduto);

                break;

                /*
                 * novoProduto.setId(id);
                 * novoProduto.setDescricao(descicao);
                 * 
                 * 
                 */
            }

            case 2: {
                List<Produto> listaProdutos = produtosDB.getProdutoList();

                for (Produto produto : listaProdutos) {

                    System.out.println("---ID:  " + produto.getId());
                    System.out.println("---Descricao:  " + produto.getDescricao());
                    System.out.println("---preco:  " + produto.getPreco());
                    System.out.println("---Data de Validade:  " + produto.getDate());
                    System.out.println("--------------------------------------------");
                }

                break;

            }
            case 0: {
                break;
            }
        }
    }

}
