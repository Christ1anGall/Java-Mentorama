package chamada.src.models;

import java.time.LocalDate;

public class Presenca {
    private Aluno aluno;
    private boolean presente;
    private LocalDate data;

    public Presenca(Aluno aluno, boolean presente, LocalDate data) {
        this.aluno = aluno;
        this.presente = presente;
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public boolean isPresente() {
        return presente;
    }

    public LocalDate getData() {
        return data;
    }
}
