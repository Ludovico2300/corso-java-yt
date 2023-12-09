import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cucinaPranzo();
        int totaleSpeso = addizione(20, 3);
        System.out.println(totaleSpeso);
    }

    static void cucinaPranzo() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Cosa vuoi cucinare?");
        String cibo = tastiera.nextLine();
        System.out.println("sto cucinando " + cibo.toLowerCase());
        tastiera.close();
    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }

}
