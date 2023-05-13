package produtos2.src;

import produtos.src.models.Produto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a descrição do Produto ?");
        String descicao = scanner.nextLine();

        System.out.print("Qual o ID do Produto?");
        int id = scanner.nextInt();

        Produto novoProduto = new Produto(id, descicao);
        /*
         * novoProduto.setId(id);
         * novoProduto.setDescricao(descicao);
         */
        System.out.println("Produto Criado com Sucesso");
        System.out.println("---ID:" + novoProduto.getId());
        System.out.println("---Descricao: " + novoProduto.getDescricao());
    }

}
