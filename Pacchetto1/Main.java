package Pacchetto1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // itiratori
        ArrayList<String> persone = new ArrayList<>();

        persone.add("Mario");
        persone.add("Luigi");
        persone.add("Peach");
        persone.add("Toad");

        Iterator<String> it = persone.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s == "Luigi") {
                it.remove();
            }

        }
        System.out.println(persone);

    }

}
