package ud2.ejercicios;

import java.util.Scanner;

public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edad: ");
        int n = sc.nextInt();
        int suma = 0;
        double nAlumnos = 0;
        int nMayorEdad = 0;
        while (n > 0) {
            suma += n;
            nAlumnos++;
            if (n >= 18) {
                nMayorEdad++;
            }
            System.out.println("Introduce edad: ");
            n = sc.nextInt();

        }
        sc.close();
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + suma / nAlumnos);
        System.out.println("Número alumnos: " + nAlumnos);
        System.out.println("Mayores de edad: " + nMayorEdad);
    }
}
