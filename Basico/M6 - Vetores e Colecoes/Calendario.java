public class Calendario {
    public static void main(String[] args) {
        int[][] calendario = new int[5][7];

        int dia = 0;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 7; j++) {
                if (dia < 31) {

                    dia++;

                    calendario[i][j] = dia;
                }

            }
        }

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {

                System.out.print(calendario[i][j] + " ");

            }
            System.out.println("");
        }
    }
}
