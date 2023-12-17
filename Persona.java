public class Persona {

    String nome;
    String cognome;
    static int numeroPersona;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        numeroPersona++;
        System.out.println("collegato all'istanza:  " + numeroPersona);
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    void saluta() {
        System.out.println("Ciao io sono " + this.nome);
    }

    void saluta(Persona personaDaSaluatare) {
        System.out.println("Ciao " + personaDaSaluatare.nome + " io sono " + this.nome);
    }

    void cammina() {
        System.out.println("Sto camminando");
    }

    public String toString() {
        String s = "Nome: " + this.nome + " Cognome: " + this.cognome;
        return s;
    }

    static void mostraNumeroPersona() {
        System.out.println("metodo statico: " + numeroPersona);
    }

}