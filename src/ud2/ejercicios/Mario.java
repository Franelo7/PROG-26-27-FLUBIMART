package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         Mario
 */
public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arriba = 0;
        int abajo = 0;

        int n = sc.nextInt();
        int aux = 0;
        int h = n;
        while (h != -1) {
            n = sc.nextInt();
            if (n == -1) {
                h = -1;
            } else {
                if (n > h && n != aux) {
                    arriba++;
                    h = n;
                } else if (h > n) {
                    abajo++;
                    h = n;
                }

                aux = h;

            }

        }
        sc.close();
        System.out.println(arriba);
        System.out.println(abajo);
    }

}
