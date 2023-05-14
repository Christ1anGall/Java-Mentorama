package chamada.src.models;

import java.util.ArrayList;
import java.util.List;

public class SalaDeAula {
    private String nome;
    private List<Aluno> alunos;

    public SalaDeAula(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
}
