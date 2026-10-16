package ud2.ejercicios.bucles;

/**
 * @author Fran
 *         SumarImpares
 */
public class SumarImpares {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                n += i;
            }
        }
        System.out.println(n);
    }
}
