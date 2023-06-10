package br.com.Alunos.AlunosMentorama;

public class AlunoAlreadyExistsException extends RuntimeException {

    public AlunoAlreadyExistsException(String message) {
        super(message);
    }
}