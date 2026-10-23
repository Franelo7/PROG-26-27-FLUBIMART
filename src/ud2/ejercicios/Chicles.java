package ud2.ejercicios;

/**
 * @author Fran
 *         ChiclesDeRegalo
 */
public class Chicles {
    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(10, -1, 0));
    }

    static int totalChicles(int envoltoriosComprados, int envoltoriosReunir, int chiclesADar) {
        if (envoltoriosReunir == 0) {
            return envoltoriosComprados;
        } else if (envoltoriosComprados == -1 || envoltoriosReunir == -1 || chiclesADar == -1
                || envoltoriosReunir < chiclesADar) {
            return -1;
        } else {
            int primerosCaramelos = envoltoriosComprados / envoltoriosReunir;
            int total = primerosCaramelos / envoltoriosReunir + envoltoriosComprados + primerosCaramelos;
            return total;
        }

    }
}
