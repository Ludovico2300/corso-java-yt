package Pacchetto1;

public class Main {

    public static void main(String[] args) {
        // casting --> conversione di un tipo in un altro
        // implicito

        int a = 10;
        double b = a;
        System.out.println(b);
        System.out.println(a);
        System.out.println("----------------------");

        // esplcito (quando passo da un tipo di dato ampio a uno più ristretto)

        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
        System.out.println(c);
        System.out.println("----------------------");

    }

}
