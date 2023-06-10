package br.com.Alunos.AlunosMentorama;

public class AlunoNotFoundException extends RuntimeException {

    public AlunoNotFoundException(String message) {
        super(message);
    }
}