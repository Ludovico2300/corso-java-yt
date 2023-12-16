
public class Main {

    public static void main(String[] args) {
        // array di oggetti
        Persona[] persone = new Persona[3];
        Persona persona1 = new Persona("Mario", "Rossi", 23, "rosso");
        Persona persona2 = new Persona("Luca", "Verdi", 22, "blu");
        Persona persona3 = new Persona("Giovanni", "Neri", 21, "nero");

        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;

        System.out.println(persone[0].toString());
    }

}
