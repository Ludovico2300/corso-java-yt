
public class Main {

    public static void main(String[] args) {

        // ereditarietà
        // classe figlia eredita tutti i metodi e attributi di classe madre
        Persona persona1 = new Persona("Mario", "Rossi");
        persona1.saluta();

        Studente studente1 = new Studente("Luigi", "Verdi", "Informatica");
        studente1.saluta();
        studente1.studia();

        Insegnante insegnante1 = new Insegnante("Gianni", "Bianchi", "Italiano");
        insegnante1.insegna();

        // over riding
        // sovrascrivo il metodo della classe madre
        persona1.saluta();
        studente1.saluta();
        insegnante1.saluta();
        System.out.println(studente1.materiaPreferita);
        System.out.println(insegnante1.materia);

    }

}
