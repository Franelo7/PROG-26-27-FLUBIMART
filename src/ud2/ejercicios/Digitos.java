package ud2.ejercicios;
/**
 * @author Fran
 * Digitos
 */
public class Digitos {
    public static void main(String[] args) {
        digitos(123);
    }

    static void digitos(long n) {
        long espejo = 0;
        long copia = n;
        while (copia > 0) {
            espejo *= 10;
            espejo += copia % 10;
            copia /= 10;
        }
        while (espejo > 0) {
            System.out.println(espejo % 10);
            espejo /= 10;
        }
    }
}
