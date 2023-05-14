package chamada.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import chamada.src.models.Aluno;
import chamada.src.models.ListaDePresenca;
import chamada.src.models.Presenca;
import chamada.src.models.SalaDeAula;

public class App {
   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Criar sala de aula
            System.out.println("Digite o nome da sala de aula:");
            String nomeSalaDeAula = scanner.nextLine();
    
            SalaDeAula salaDeAula = new SalaDeAula(nomeSalaDeAula);
    
            // Adicionar alunos na sala de aula
            while (true) {
                System.out.println("Digite o nome do aluno (ou 'sair' para terminar a adição de alunos):");
                String nomeAluno = scanner.nextLine();
    
                if (nomeAluno.equals("sair")) {
                    break;
                }
    
                System.out.println("Digite a matrícula do aluno:");
                String matriculaAluno = scanner.nextLine();
    
                Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
                salaDeAula.adicionarAluno(aluno);
            }
    
            // Registrar presença dos alunos na lista de presença
            ListaDePresenca listaDePresenca = new ListaDePresenca(salaDeAula);
    
            System.out.println("Digite a data da aula (no formato dd/mm/aaaa):");
            String dataString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataString, formatter);
    
            for (Aluno aluno : salaDeAula.getAlunos()) {
                System.out.println("O aluno " + aluno.getNome() + " está presente na aula? (sim ou nao)");
                String resposta = scanner.nextLine();
    
                boolean presente = resposta.equalsIgnoreCase("sim");
    
                listaDePresenca.registrarPresenca(aluno, presente, data);
            }
    
            // Imprimir lista de presença
            System.out.println("Lista de presença da " + salaDeAula.getNome() + " em " + dataString + ":");
            for (Presenca presenca : listaDePresenca.getPresencas()) {
                System.out.println(presenca.getAluno().getNome() + " - " + (presenca.isPresente() ? "presente" : "ausente") + " em " + presenca.getData().format(formatter));
            }
    
            scanner.close();
        }
    }

