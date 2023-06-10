package br.com.alunos.Aula.AlunosAula;

public class AlunoNaoEncontradoException extends Exception {

    public AlunoNaoEncontradoException(final String nome) {
        super("Aluno " + nome + " Não encontrado");

    }
}
