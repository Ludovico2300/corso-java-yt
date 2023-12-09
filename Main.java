
public class Main {

    public static void main(String[] args) {
        int totaleSpeso = addizione(20, 3);
        int totaleSpeso2 = addizione(20, 3, 5);
        double totaleSpesoDouble = addizione(22.4, 3.7);
        System.out.println(totaleSpeso);
        System.out.println(totaleSpeso2);
        System.out.println(totaleSpesoDouble);
    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }

    static int addizione(int a, int b, int c) {
        int risultato = a + b + c;
        return risultato;
    }

    static double addizione(double a, double b) {
        double risultato = a + b;
        return risultato;
    }

}

// overloaded methods: un metodo con stesso nome ma parametri diversi (tipi,
// numero)
