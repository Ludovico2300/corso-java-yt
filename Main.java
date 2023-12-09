
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("INIZIO ARRAY LIST");

        // ARRAY LIST --> accettano sono references
        ArrayList<String> persone = new ArrayList<>();
        persone.add("Mario");
        persone.add("Luigi");
        persone.add("Giovanni");
        persone.add("Marco");

        // mandare a schermo
        System.out.println(persone.get(0));

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }

        for (String persona : persone) {
            System.out.println(persona);
        }

        // modificare elemento
        persone.set(0, "Mario Rossi");

        // rimuovere elemento
        persone.remove(0);
        persone.clear();

        // arrayList 2d
        ArrayList<ArrayList<String>> classi = new ArrayList<>();

        ArrayList<String> persone1 = new ArrayList<>();
        persone1.add("Mario");
        persone1.add("Alex");
        persone1.add("Giovanni");
        persone1.add("Marco");

        ArrayList<String> persone2 = new ArrayList<>();
        persone2.add("Mario");
        persone2.add("Luigi");
        persone2.add("Giovanni");
        persone2.add("Pippo");

        classi.add(persone1);
        classi.add(persone2);

        for (ArrayList<String> classe : classi) {
            System.out.println();
            for (String persona : classe) {
                System.out.print(persona + " ");
            }
        }

    }

}
