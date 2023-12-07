import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual'è il tuo nome?");
        String nome = scanner.nextLine();

        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();
        scanner.nextLine();// perche nextInt non mi fa andare a capo per andare avanti con l'inserimento

        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Qual'è la tua città?");
        String citta = scanner.nextLine();

        scanner.close();

        System.out.println("Ciao " + nome + " " + cognome + ", vivi a " + citta + " e hai " + eta + " anni!");
    }
}
