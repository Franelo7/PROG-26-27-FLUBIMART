package ud2.ejercicios.metodos;
/**
 * @author Fran
 * Maximo
 */
public class Maximo {
    public static void main(String[] args) {
        double n1 = 12.1;
        double n2 = 13.1;
        System.out.println(maximoDeAmbos(n1, n2));
    }

    public static double maximoDeAmbos(double n1, double n2) {
        return Math.max(n1, n2);
    }

}
