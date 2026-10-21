package ud2.ejercicios.metodos;

/**
 * @author Fran
 *         Primo
 */

public class Primo {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i++) {
            System.out.println(i + " " + esPrimo(i));
        }
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
