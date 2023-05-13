public class textos {
    public static void main(String[] args) {
        // primitivos
        char vetores[] = { 'a', 'b', 'c' };

        String txto = String.valueOf(vetores);
        System.out.println(txto);

        long longConvertido = 12;
        String valor = String.valueOf(longConvertido);
        System.out.println(valor);

        Double valorDouble = Double.valueOf(valor);
        Double StringNpode = Double.valueOf(txto);
        System.out.println(valorDouble);
        System.out.println(StringNpode);
    }
}
