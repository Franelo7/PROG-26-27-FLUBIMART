package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Fran
 *         ContarCifras
 */
public class ContarCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre -99999 y 99999: ");
        int n = sc.nextInt();
        sc.close();
        int c = 0;
        if (n <= 99999 && n >= -99999) {
            if (n != 0) {
                n = n / 10;
                c++;
                if (n != 0) {
                    n = n / 10;
                    c++;
                }
                if (n != 0) {
                    n = n / 10;
                    c++;
                }
                if (n != 0) {
                    n = n / 10;
                    c++;
                }
                if (n != 0) {
                    n = n / 10;
                    c++;
                }
            } else {
                c++;
            }
            System.out.println("Tiene " + c + " cifras");
        } else {
            System.out.println("Número fuera de rango");
        }
    }
}
