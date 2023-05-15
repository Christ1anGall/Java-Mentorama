package src;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import src.db.EstoqueDB;
import src.db.ProdutosDB;
import src.db.UsuarioDB;
import src.models.Admin;
import src.models.Cliente;
import src.models.Estoque;
import src.models.Produto;
import src.models.Usuario;

public class App {

    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuarioDB usuariosDB = new UsuarioDB();
    static EstoqueDB estoqueDB = new EstoqueDB();

    public static void main(String[] args) throws Exception {

        System.out.println("-----PEDIDO DE VENDAS------");

        int opt;

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("7 - Listar Estoque de Produtos");
            System.out.println("6 - Estoque de Produtos");
            System.out.println("5 - Listar Usuarios");
            System.out.println("4 - Cadastrar Cliente");
            System.out.println("3 - Cadastrar ADM");
            System.out.println("2 - Listar Produtos");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("0 ----- Sair");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Qual Operação você deseja realizar: ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

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

            case 3: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual o nomde do User ADM ?");
                String nome = scanner.nextLine();

                Admin novoAdmin = new Admin(nome);
                UsuarioDB.addNovoUsuario(novoAdmin);
                System.out.println("Cadastrado");

                break;
            }

            case 4: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual o nomde do User Cliente ?");

                String nome = scanner.nextLine();

                Cliente novoACliente = new Cliente(nome);
                UsuarioDB.addNovoUsuario(novoACliente);
                System.out.println("Cadastrado");
                break;
            }

            case 5: {
                System.out.println("*************************************************");
                System.out.println("*****************Listando Users******************");
                for (Usuario usuario : UsuarioDB.getUsuarioList()) {

                    System.out.println("ID: " + usuario.getId());
                    System.out.println("Nome: " + usuario.getNome());
                    System.out.println("Tipo: " + usuario.getTipoUsuario());
                }
                System.out.println("*************************************************");
                break;
            }

            case 6: {

                System.out.println("*************************************************");
                System.out.println("********Cadastrando Estoque de Produtos**********");
                System.out.println("Insira a descrição do Estoque");

                Scanner scanner = new Scanner(System.in);
                String id = scanner.nextLine();

                System.out.println("Insira o produto informando o ID");
                Integer idProduto = scanner.nextInt();

                Produto produto = produtosDB.getProdutoId(idProduto);

                System.out.println("Produto ID:" + produto.getId());

                System.out.println("Produto Descrição:" + produto.getDescricao());

                System.out.println("Produto Validade:" + produto.getDate());

                System.out.println("qual a quantidade a ser adicionada em Estoque ?");

                Integer quantidade = scanner.nextInt();

                Estoque novEstoque = new Estoque(id, produto, quantidade);

                estoqueDB.addNovoEstoque(novEstoque);

                break;
            }
            case 7: {
                System.out.println("*************************************************");
                System.out.println("*****************Listando Estoques******************");
                for (Estoque estoque : EstoqueDB.getProdutoList()) {

                    System.out.println("ID: " + estoque.getId());
                    System.out.println("Produto: " + estoque.getProduto().getDescricao());
                    System.out.println("Preco: " + estoque.getProduto().getPreco());
                    System.out.println("Quantidade: " + estoque.getQuantidade());
                }
                System.out.println("*************************************************");
                break;

            }
            case 0: {
                break;
            }
        }
    }

}
