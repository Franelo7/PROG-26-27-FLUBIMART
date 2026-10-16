package ud2.ejercicios.metodos;

/**
 * @author Fran
 *         Maximo
 */
public class Maximo {
    public static void main(String[] args) {
        double n1 = 12.1;
        double n2 = 10.1;
        double n3 = 13;
        double n4 = 121;
        System.out.println(maximoDeDos(n1, n2)); // 12.1
        System.out.println(maximoDeTres(n1, n2, n3)); // 13
        System.out.println(maximoDeCuatro(n1, n2, n3, n4)); // 121
    }

    public static double maximoDeDos(double n1, double n2) {
        return Math.max(n1, n2);
    }

    public static double maximoDeTres(double n1, double n2, double n3) {
        return Math.max(maximoDeDos(n1, n2), n3);
    }

    public static double maximoDeCuatro(double n1, double n2, double n3, double n4) {
        return Math.max(maximoDeTres(n1, n2, n3), n4);
    }
}
