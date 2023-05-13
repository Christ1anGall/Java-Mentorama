public class MetodosString {
    public static void main(String[] args) {
        String texto = "Mentorama - Java";
        String texto2 = "Mentorama - JAVA";
        System.out.println(texto.charAt(3));
        // System.out.println(texto.charAt(30));// ERROR

        System.out.println(texto.compareTo(texto2));
        System.out.println(texto.compareToIgnoreCase(texto2));

        System.out.println(texto.equals(texto2));
        System.out.println(texto.equalsIgnoreCase(texto2));

        System.out.println(texto.startsWith("Men"));

        System.out.println(texto2.endsWith("ava"));

        String[] textos = texto2.split("-");

        System.out.println(textos);

        String vazia = "";

        for (String value : textos) {
            System.out.println("." + value.toLowerCase().trim() + ".");
            System.out.println(value.toUpperCase().trim());
            System.out.println(texto.isEmpty());
            System.out.println(vazia.isEmpty());

            System.out.println(texto.substring(1, 3));
        }

        System.out.println("BATATA" + "FRITA");

        System.out.println("Hyper".concat("SPACE"));

    }
}
