package metodos;

public class Segundo {

    private void metodoPrivado() {

        Primeiro primeiro = new Primeiro();

        primeiro.metodoPublico();

        primeiro.metodoPrivado(); // Não é possible access

        primeiro.metodoProtect();

        primeiro.metodoDefault();

        Primeiro.metodoStatic();
    }

}
