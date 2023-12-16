
public class Main {

    public static void main(String[] args) {

        // static e final, cosa sono
        // final

        final int finale = 10;
        // finale = 20; // non posso cambiare il valore di finale

        // static valore uguale per tutte le istanze (vedi numeroPersone)

        Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona("Mario", "Bianchi");
        Persona.mostraNumeroPersona();

    }

}
