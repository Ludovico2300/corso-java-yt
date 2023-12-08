
public class Main {

    public static void main(String[] args) {

        // ciclo while (verifico la condizione prima)
        int i = 0;
        while (i < 10) {
            System.out.println("while " + i);
            i++;
        }

        // ciclo do-while (verifico la condizione dopo), almeno una volta eseguo il
        // codice
        int j = 0;
        do {
            System.out.println("do-while " + j);
            j++;
        } while (j < 10);

    }
}
