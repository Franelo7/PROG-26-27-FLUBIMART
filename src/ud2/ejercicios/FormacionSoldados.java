package ud2.ejercicios;

import java.util.Scanner;

public class FormacionSoldados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número de soldados: ");
        int n = sc.nextInt();
        formacion(n);
    }

    static void formacion(int n) {
        if (n < 4) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
        }

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                int q = (int) Math.pow(Math.sqrt(n), 2);
            }
            System.out.println("Formación de: " + i + " soldados");
            for (int j = 0; j < Math.sqrt(i); j++) {
                for (int j2 = (int) Math.sqrt(i); j2 > 0; j2--) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }

    }
}
