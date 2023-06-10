package br.com.alunos.Aula.AlunosAula;

public class AlunosMain {
    public static void main(String[] args) {
        try {
            final String aluno = new AlunoService().findAluno("Lucas Silva");
            System.out.println(aluno);
        } catch (AlunoNaoEncontradoException e) {

            e.printStackTrace();
        }
    }

}
