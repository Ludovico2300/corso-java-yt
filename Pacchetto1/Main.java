package Pacchetto1;

public class Main {

    public static void main(String[] args) {
        // copiare oggetti
        Persona persona1 = new Persona("Ludo", "Colucci");

        Persona persona2 = new Persona("Mario", "Rossi");

        persona2.copy(persona1);

        Persona persona3 = new Persona(persona2);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println();
        System.out.println(persona1.getNome());
        System.out.println(persona1.getCognome());
        System.out.println();
        System.out.println(persona2.getNome());
        System.out.println(persona2.getCognome());
        System.out.println();
        System.out.println(persona3.getNome());
        System.out.println(persona3.getCognome());

    }

}
