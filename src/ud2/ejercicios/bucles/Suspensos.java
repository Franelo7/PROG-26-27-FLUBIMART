package ud2.ejercicios.bucles;

import java.util.Scanner;
/**
 * @author Fran
 * Suspensos
 */
public class Suspensos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSuspensos = 0;
        double n;
        do {
            System.out.print("Introduce la nota: ");
            n = sc.nextDouble();
            if (n < 5 && n != -1) {
                nSuspensos++;
            }
        } while (n != -1);
        sc.close();
        System.out.println("El número de suspensos es de: " + nSuspensos);
    }
}
