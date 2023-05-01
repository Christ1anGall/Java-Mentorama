package metodos2;

import metodos.Primeiro;

public class Terceiro {
    private void metodoPrivado() {

        Primeiro primeiro = new Primeiro();
        primeiro.metodoPublico();

        primeiro.metodoProtect(); // Não é possible access, pacote separado

        primeiro.metodoDefault();// Não é possible access, pacote separado

        Quarta quarta = new Quarta();

        quarta.metodoPublico();

    }
}
