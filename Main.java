
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

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
    }
}
