
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("INIZIO ARRAY");

        // array, crearne uno, associare elementi, metodo to string, lunghezza,
        // modificare e mostrare elementi

        // array
        int[] numbers = new int[3];
        int[] numbers2 = new int[] { 10, 20, 30 };

        // associare elementi
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // metodo to string
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // lunghezza
        System.out.println(numbers.length);

        // modificare e mostrare elementi
        numbers[0] = 2;
        System.out.println(numbers[0]);

        // array e ciclo for
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("ciclo for " + numbers2[i]);
        }

        // array e ciclo for-each
        for (int number : numbers2) {
            System.out.println("ciclo for each " + number);
        }

        System.out.println("INIZIO ARRAY MULTIDIMENSIONALI");

        // array multidimensionale
        String[][] classi = new String[3][3];

        // associare elementi array multidimensionale
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Lucia";
        classi[1][1] = "Alessia";
        classi[1][2] = "Pippo";

        classi[2][0] = "Mario";
        classi[2][1] = "Gianni";
        classi[2][2] = "Paolo";

        System.out.println(classi[2][1]);

        // array 2D e ciclo foR
        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();

            for (int alunno = 0; alunno < classi[classe].length; alunno++) {
                System.out.print(classi[classe][alunno] + " ");
            }
        }
        System.out.println();
        // array 2D e ciclo for-each
        for (String[] classe : classi) {
            System.out.println();

            for (String alunno : classe) {
                System.out.print(alunno + " ");
            }
        }

    }
}
