package Pacchetto1;

public class Persona {
    private String nome;
    private String cognome;

    Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    Persona(Persona persona) {
        this.copy(persona);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setCognome(String cognome) {
        return this.cognome = cognome;
    }

    public void saluta() {
        System.out.println("Ciao");
    }

    public void copy(Persona persona) {
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

}
