package ud2.ejercicios.metodos;
/**
 * @author Fran
 * NumDivisoresPrimos
 */
public class NumDivisoresPrimos {

    public static void main(String[] args) {
        divisoresPrimos(20);
    }

    public static void divisoresPrimos(int n) {
        for (int i = 1; i <= n; i++) {
            if (Primo.esPrimo(i) && n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
