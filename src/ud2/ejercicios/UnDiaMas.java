package ud2.ejercicios;

import java.time.LocalDate;
import java.util.Scanner;
/**
 * @author Fran
 * UnDiaMas
 */
public class UnDiaMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día: ");
        int d = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int m = sc.nextInt();
        System.out.print("Introduce el año: ");
        int a = sc.nextInt();
        sc.close();
        System.out.println(LocalDate.of(a, m, d).plusDays(1));
    }
}
