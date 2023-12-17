package Pacchetto1;

public class Pesce implements Preda, Predatore {
    @Override
    public void scappa() {
        System.out.println("Il pesce scappa");
    }

    @Override
    public void caccia() {
        System.out.println("Il pesce caccia");

    }

}
