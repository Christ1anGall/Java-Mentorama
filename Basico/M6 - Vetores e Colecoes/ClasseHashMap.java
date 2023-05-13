import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class ClasseHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("C", "Carro");
        map.put("B", "Barco");
        map.put("A", "Avião");
        map.put("M", "Moto");

        System.out.println(map.get("C"));

        map.remove("M");

        System.out.println(map.get("M"));

        Map<String, String> map2 = new TreeMap<>();

        map2.put("C", "Carro");
        map2.put("B", "Barco");
        map2.put("A", "Avião");
        map2.put("M", "Moto");

        System.out.println(map2.get("C"));

        map2.remove("M");

        System.out.println(map2.get("M"));

    }
}