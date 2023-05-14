package chamada.src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaDePresenca {
    private List<Presenca> presencas = new ArrayList<>();
    private SalaDeAula salaDeAula;

    public ListaDePresenca(SalaDeAula salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    public void registrarPresenca(Aluno aluno, boolean presente, LocalDate data) {
        Presenca presenca = new Presenca(aluno, presente, data);
        presencas.add(presenca);
    }

    public List<Presenca> getPresencas() {
        return presencas;
    }

    public SalaDeAula getSalaDeAula() {
        return salaDeAula;
    }
}