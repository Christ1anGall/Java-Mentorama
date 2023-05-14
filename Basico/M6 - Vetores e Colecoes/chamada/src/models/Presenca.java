package chamada.src.models;

public class Presenca {
    private Aluno aluno;
    private boolean presente;

    public Presenca(Aluno aluno, boolean presente) {
        this.aluno = aluno;
        this.presente = presente;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public boolean isPresente() {
        return presente;
    }
}