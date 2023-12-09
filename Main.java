
public class Main {

    public static void main(String[] args) {
        Persona Luca = new Persona("Luca", "Rossi", 23, "Blu");
        Luca.saluta();
        Luca.setColorePreferito("Rosso");
        System.out.println(Luca.colorePreferito);

    }

}
