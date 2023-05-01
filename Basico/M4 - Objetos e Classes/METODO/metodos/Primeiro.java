package metodos;

/**
 * Primeiro
 */
public class Primeiro {

    private static Integer variavel = 1;

    private Integer escopoClasse;

    public static Integer metodoStatic() {
        return 0;
    }

    public final static Integer CONSTANTE = 10;

    public void metodoPublico() {
        variavel = 2;

        System.out.println(variavel);

        variavel = 5;

        System.out.println(variavel);

        System.out.println(escopoClasse);

        escopoClasse = variavel * 3;

        System.out.println(escopoClasse);

        // CONSTANTE = 20; // não possivel

    }

    public void alteraVariavel() {
        System.out.println(escopoClasse);
        escopoClasse += 6;
    }

    private void metodoPrivado() {

    }

    protected void metodoProtect() {

    }

    void metodoDefault() {

    }
}