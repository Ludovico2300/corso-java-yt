package Pacchetto1;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // hashmap

        HashMap<String, String> capitali = new HashMap<>();
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Germania", "Berlino");
        capitali.put("Spagna", "Madrid");

        System.out.println(capitali);
        System.out.println(capitali.get("Italia"));
        capitali.remove("Francia");
        System.out.println(capitali);
        capitali.clear();
        System.out.println(capitali);
    }

}
