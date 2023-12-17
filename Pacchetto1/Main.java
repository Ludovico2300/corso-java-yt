package Pacchetto1;

public class Main {

    public static void main(String[] args) {
        // polimorfismo
        // un oggetto può assumere più tipi di classe

        Studente studente1 = new Studente("Mario", "Rossi");
        Studente studente2 = new Studente("Marco", "Verdi");
        Insegnante insegnante1 = new Insegnante("Luigi", "Verdi");

        Persona[] classe = { studente1, studente2, insegnante1 };

        for (Persona persona : classe) {
            persona.saluta();
        }
    }

}
