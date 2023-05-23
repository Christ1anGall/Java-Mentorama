package src.validadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Validador {
    private final List<String> errors = new ArrayList<>();

    public abstract boolean ehValidado();

    public List<String> getErrors() {
        return errors;
    }

    public void adicionarErro(String erro) {
        this.errors.add(erro);
    }

}
