package ud2.ejercicios;

/**
 * @author Fran
 *         Capicua
 */
public class Capicua {
    public static void main(String[] args) {
        System.out.println(esCapicua(999));
    }

    public static boolean esCapicua(long n) {
        long espejo = 0;
        long copia = n;
        while (copia > 0) {
            espejo *= 10;
            espejo += copia % 10;
            copia /= 10;
        }
        if (espejo == n) {
            return true;
        }
        return false;
    }

}
