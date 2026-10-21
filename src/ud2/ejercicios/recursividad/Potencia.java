package ud2.ejercicios.recursividad;

/**
 * @author Fran
 *         Potencia
 */

public class Potencia {
    public static void main(String[] args) {
        System.out.println(potenciaIterativa(9, 4));
        System.out.println(potenciaRecursiva(9, 4));

    }

    static int potenciaIterativa(int n, int x) {
        int r = 1;
        for (int i = 0; i < x; i++) {
            r *= n;
        }
        return r;
    }

    static int potenciaRecursiva(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * potenciaRecursiva(n, x - 1);
    }
}
