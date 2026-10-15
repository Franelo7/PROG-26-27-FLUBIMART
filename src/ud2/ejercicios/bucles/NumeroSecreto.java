package ud2.ejercicios.bucles;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Fran
 *         NumeroSecreto
 */
public class NumeroSecreto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rnd = random.nextInt(1, 100) + 1;
        System.out.println(rnd);
        System.out.println("Introduce el número \n(-1 para rendirte): ");
        int n = sc.nextInt();
        int fallos = 0;

        while (n != -1 && n != rnd) {

            System.out.println("Incorrecto!!!");
            fallos++;
            if (n < rnd) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");

            }
            System.out.println("Introduce el número \n(-1 para rendirte): ");
            n = sc.nextInt();
        }
        sc.close();
        if (n == rnd) {
            System.out.println("Acertaste");
            System.out.println("Número intentos fallidos: " + fallos);
        } else if (n == -1) {
            System.out.println("Número intentos fallidos: " + fallos);
            System.out.println("El número era: " + rnd);
        }

    }

}
