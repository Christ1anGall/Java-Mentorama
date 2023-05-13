import java.util.ArrayList;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {
        // ArrayList<String> array = new ArrayList<>();
        List<String> array = new ArrayList<>();
        array.add("Carro");
        array.add("Moto");
        array.add("barco");
        array.add("Aviao");

        System.out.println(array.get(0));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(1));

        for (String veiculo : array) {
            System.out.println(veiculo);
        }

        array.remove(1);

        for (int i = 0; i < args.length; i++) {
            System.out.println(array.get(i));
        }

    }
}
