package ud2.ejercicios;

/**
 * @author Fran
 *         ChiclesDeRegalo
 */
public class Chicles {
    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(100, 25, 3));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(10, -1, 0));
    }

    public static int totalChicles(int chiclesIniciales, int envoltoriosNecesarios, int chiclesGratisEnLaOferta) {
        int envoltoriosPendientes = chiclesIniciales;
        int totalChicles = chiclesIniciales;
        if (chiclesIniciales < 0 || envoltoriosNecesarios < 0 || chiclesGratisEnLaOferta < 0
                || chiclesGratisEnLaOferta > envoltoriosNecesarios) {
            return -1;
        } else if (envoltoriosNecesarios == 0) {
            return chiclesIniciales;
        }
        while (envoltoriosPendientes >= envoltoriosNecesarios) {
            int chiclesDeRegalo = envoltoriosPendientes / envoltoriosNecesarios * chiclesGratisEnLaOferta;
            int envoltorioSobrantes = envoltoriosPendientes % envoltoriosNecesarios;
            // envoltoriosPendientes = (envoltoriosPendientes / envoltoriosNecesarios) *
            // chiclesGratisEnLaOferta;
            totalChicles = totalChicles + chiclesDeRegalo;
            envoltoriosPendientes = envoltorioSobrantes + chiclesDeRegalo;
        }
        return totalChicles;

    }
}
