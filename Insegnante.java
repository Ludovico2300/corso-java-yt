public class Insegnante extends Persona {

    String materia;

    public Insegnante(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    void insegna() {
        System.out.println("Insegno la materia " + materia);
    }

    @Override
    void saluta() {
        System.out.println("Buongiorno Ragazzi, sono " + this.cognome);
    }

}
