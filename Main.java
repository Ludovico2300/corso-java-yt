
public class Main {

    public static void main(String[] args) {
        System.out.println("INIZIO METODI STRINGHE");

        // metodi stringhe
        String nome = "Mario";
        String cognome = "Rossi";
        String nomeCompleto = nome + " " + cognome;
        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto.length());
        System.out.println(nomeCompleto.toUpperCase());
        System.out.println(nomeCompleto.toLowerCase());
        System.out.println(nomeCompleto.indexOf("M"));
        System.out.println(nomeCompleto.indexOf("R"));
        System.out.println(nomeCompleto.indexOf("R"));
        System.out.println(nomeCompleto.equals(nomeCompleto));
        System.out.println(nomeCompleto.equals(nomeCompleto.toUpperCase()));
        System.out.println(nomeCompleto.equalsIgnoreCase(nomeCompleto.toUpperCase()));
        System.out.println(nomeCompleto.lastIndexOf(" "));
        System.out.println(nomeCompleto.substring(0, 4));
        System.out.println(nomeCompleto.substring(5));
        System.out.println(nomeCompleto.substring(5, 7));
        System.out.println(nomeCompleto.replace("Mario", "Giovanni"));
        System.out.println(nomeCompleto.replace(" ", "_"));
        System.out.println(nomeCompleto.trim());
        System.out.println(nomeCompleto.trim().length());
        System.out.println(nomeCompleto.trim().toUpperCase());
        System.out.println(nomeCompleto.trim().toLowerCase());
        System.out.println(nomeCompleto.trim().indexOf("M"));
        System.out.println(nomeCompleto.trim().indexOf("R"));
        System.out.println(nomeCompleto.trim().indexOf(" "));
        System.out.println(nomeCompleto.trim().lastIndexOf(" "));
        System.out.println(nomeCompleto.trim().substring(0, 4));
        System.out.println(nomeCompleto.trim().substring(5));
        System.out.println(nomeCompleto.trim().substring(5, 7));
        System.out.println(nomeCompleto.trim().replace("Mario", "Giovanni"));
        System.out.println(nomeCompleto.trim().replace(" ", "_"));
        System.out.println(nomeCompleto.trim().trim());
        System.out.println(nomeCompleto.trim().trim().length());

    }
}
