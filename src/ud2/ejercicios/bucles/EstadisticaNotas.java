package ud2.ejercicios.bucles;

import java.util.Scanner;
/**
 * @author Fran
 * EstadisticaNotas
 */

public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSuspensos = 0;
        int nAprobados = 0;
        int nCondicionados = 0;
        double n;
        do {
            System.out.print("Introduce la nota: ");
            n = sc.nextDouble();
            if (n < 4 && n != -1) {
                nSuspensos++;
            } else if (n >= 5) {
                nAprobados++;
            } else if (n >= 4 && n < 5) {
                nCondicionados++;
            }
        } while (n != -1);
        sc.close();
        System.out.println("El número de suspensos es de: " + nSuspensos);
        System.out.println("El número de condicionados es de: " + nCondicionados);
        System.out.println("El número de aprobados es de: " + nAprobados);
    }
}
