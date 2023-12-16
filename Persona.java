public class Persona {

    String nome;
    String cognome;
    int eta;
    String colorePreferito;
    // Attributi
    // Metodi
    // Costruttore
    // Getter e Setter
    // toString

    public Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getColorePreferito() {
        return colorePreferito;
    }

    public void setColorePreferito(String colorePreferito) {
        this.colorePreferito = colorePreferito;
    }

    void saluta(Persona personaDaSaluatare) {
        System.out.println("Ciao " + personaDaSaluatare.nome + " io sono " + this.nome);
    }

    void cammina() {
        System.out.println("Sto camminando");
    }

    public String toString() {
        String s = "Nome: " + this.nome + " Cognome: " + this.cognome + " Età: " + this.eta + " Colore Preferito: "
                + this.colorePreferito;
        return s;
    }

}