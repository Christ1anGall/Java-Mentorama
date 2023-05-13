import java.util.HashSet;
import java.util.Set;

public class ClasseHashSet {
    public static void main(String[] args) {
        // ArrayList<String> array = new ArrayList<>();
        Set<String> array = new HashSet<>();
        array.add("Carro");
        array.add("Moto");
        array.add("barco");
        array.add("Aviao");
        array.add("Moto");

        System.out.println(array.add("Moto"));
        System.out.println(array.add("Robo"));
        // System.out.println(array.get(0));
        // System.out.println(array.get(2));
        // System.out.println(array.get(3));
        // System.out.println(array.get(1));

        for (String veiculo : array) {
            System.out.println(veiculo);
        }

        int[] valores = new int[4];

        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        int[] valoresReverso = new int[valores.length];

        int posicaoMaxia = valores.length - 1;

        for (int i = posicaoMaxia; i >= 0; i--) {
            System.out.println(valoresReverso[posicaoMaxia - i] = valores[i]);
        }

        for (int i = 0; i < valoresReverso.length; i++) {
            System.out.println(valoresReverso[i]);
        }

    }
}
