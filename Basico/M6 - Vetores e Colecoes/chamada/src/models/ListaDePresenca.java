package chamada.src.models;

import java.util.ArrayList;
import java.util.List;

public class ListaDePresenca {

    private SalaDeAula salaDeAula;
    private List<Presenca> presencas;

    public ListaDePresenca(SalaDeAula salaDeAula) {
        this.salaDeAula = salaDeAula;
        this.presencas = new ArrayList<Presenca>();
    }

    public SalaDeAula getSalaDeAula() {
        return salaDeAula;
    }

    public List<Presenca> getPresencas() {
        return presencas;
    }

    public void setSalaDeAula(SalaDeAula salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    public void setPresencas(List<Presenca> presencas) {
        this.presencas = presencas;
    }

    public void registrarPresenca(Aluno aluno, boolean presente) {
        Presenca presenca = new Presenca(aluno, presente);
        presencas.add(presenca);
    }
}
