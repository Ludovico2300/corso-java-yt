
public class Main {

    public static void main(String[] args) {

        // operatori di comparazione:
        // == uguale a
        // != diversa da
        // > maggiore di
        // < minore di
        // >= maggiore o uguale a
        // <= minore o uguale a

        int a = 5;
        int b = 10;
        boolean c = a == b;
        boolean d = a != b;
        boolean e = a > b;
        boolean f = a < b;
        boolean g = a >= b;
        boolean h = a <= b;
        System.out.println(c); // output: false
        System.out.println(d); // output: true
        System.out.println(e); // output: false
        System.out.println(f); // output: true
        System.out.println(g); // output: false
        System.out.println(h); // output: true
        System.out.println(h == f); // output: true
        System.out.println(h == g); // output: false

    }
}
