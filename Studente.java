public class Studente extends Persona {
    String materiaPreferita;

    public Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;

    }

    void studia() {
        System.out.println("Sto studiando " + materiaPreferita);
    }

    @Override
    void saluta() {
        System.out.println("Buongiorno Prof, sono " + this.cognome + " " + this.nome);
    }

}
