package ud2.ejercicios.recursividad;
/**
 * @author Fran
 * Fibbonacci
 */
public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
