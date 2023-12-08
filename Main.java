
public class Main {

    public static void main(String[] args) {

        // operatori logici
        // && (and)
        // || (or)
        // ! (not)

        int a = 10;
        int b = 20;
        int c = 30;

        boolean result = a > b && b < c;
        System.out.println(result); // output: false

        boolean result2 = a > b || b < c;
        System.out.println(result2); // output: true

        boolean result3 = !result;
        System.out.println(result3); // output: true

    }
}
