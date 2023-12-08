
public class Main {

    public static void main(String[] args) {

        // ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);
        }

        // for annidati
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("for annidato " + i + " " + j);
            }
        }

        // for enhanced --> sarebbe il for each
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : array) {
            System.out.println("for enhanced " + i);
        }

        // break and continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("for break " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("for continue " + i);
        }

    }
}
