package ud1.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 * SumaDigitos
 */
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número de 3 cifras, para calcular la suma de sus cifras: ");
        int numTotal = sc.nextInt();
        sc.close();
        int num = numTotal / 100 + numTotal / 10 % 10 + numTotal % 10;
        System.out.println(num);
    }
}
