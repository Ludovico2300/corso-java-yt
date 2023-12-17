public class Studente extends Persona {
    String materiaPreferita = "Informatica";
    String classe = "2D";
    int[] votiStoria = { 9, 9, 8 };

    public Studente(String nome, String cognome) {
        super(nome, cognome);

    }

    void studia() {
        System.out.println("Sto studiando " + materiaPreferita);
    }

    @Override
    void saluta() {
        System.out.println("Buongiorno Prof, sono " + this.cognome + " " + this.nome);
    }

}
