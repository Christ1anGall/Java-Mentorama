
public class MainTeste {
    public static void main(String[] args) {
        // PRIMITIVOS
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;

        // exemplos

        int valor1 = 12;

        int valor2 = valor1;

        System.out.println(valor1);
        System.out.println(valor2);

        Integer valor3 = Integer.valueOf(31); // n necessario >= java8

        int valor4 = valor3;

        Integer valor5 = null; // error

        valor5.doubleValue(); /* Null pointer access: The variable valor5 can only be null at this location */ // não
                                                                                                               // acontece
                                                                                                               // com
                                                                                                               // tipos
                                                                                                               // primitivos

    }
}
