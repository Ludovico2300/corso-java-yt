package Pacchetto1;

public class Main {

    public static void main(String[] args) {
        // incapsulamento
        Persona persona1 = new Persona("Ludo", "Colucci");

        persona1.setNome("Luca");
        persona1.setCognome("Bianchi");

        System.out.println(persona1.getNome());
        System.out.println(persona1.getCognome());
    }

}
