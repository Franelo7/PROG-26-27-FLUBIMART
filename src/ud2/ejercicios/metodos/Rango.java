package ud2.ejercicios.metodos;
/**
 * @author Fran
 * Rango
 */
public class Rango {
    public static void main(String[] args) {
        rango(1, 10);
    }

    public static void rango(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
