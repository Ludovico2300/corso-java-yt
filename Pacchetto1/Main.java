package Pacchetto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // gestire exception con try, catch e finally

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci un numero: ");
            int x = scanner.nextInt();

            System.out.println("Inserisci il secondo numero: ");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println(result);

            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0");
        } catch (InputMismatchException e) {
            System.out.println("Non puoi dividere un numero per una stinga");

        } catch (Exception e) {
            System.out.println("Errore generico");
        } finally {
            System.out.println("Ciao");
            scanner.close();
        }

    }

}
