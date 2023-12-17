package Pacchetto1;

public class Main {

    public static void main(String[] args) {
        // interface
        Leone leone = new Leone();
        leone.caccia();

        Gazzella gazzella = new Gazzella();
        gazzella.scappa();

        Pesce pesce = new Pesce();
        pesce.caccia();
        pesce.scappa();
    }

}
