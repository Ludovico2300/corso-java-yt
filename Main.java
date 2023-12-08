
public class Main {

    public static void main(String[] args) {

        // condizioni if (if, else, else if, if annidati, ternary operator)

        // IF
        // if (condizione) {
        // codice da eseguire se la condizione è vera
        // }

        boolean isOnline = true;
        if (isOnline) {
            System.out.println("è online");
        }

        // IF ELSE
        // if (condizione) {
        // codice da eseguire se la condizione è vera
        //
        // } else {
        // codice da eseguire se la condizione è falsa
        // }

        if (isOnline) {
            System.out.println("è online");

        } else {
            System.out.println("non è online");
        }

        // IF ELSE IF
        // if (condizione) {
        // codice da eseguire se la condizione è vera
        //
        //
        // } else if (condizione) {
        // codice da eseguire se la condizione è falsa
        // }

        int age = 18;
        if (age >= 18) {
            System.out.println("può votare");
        } else if (age >= 16) {
            System.out.println("può votare in seconda");
        }

        // TERNARY OPERATOR
        // (condizione) ? codice da eseguire se la condizione è vera : codice da
        // eseguire se la condizione è falsa
        int x = 10;
        int y = 20;
        int max = (x > y) ? x : y;
        System.out.println(max);

    }
}
