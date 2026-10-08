package ud2.ejercicios;

import java.time.LocalTime;
import java.util.Scanner;
/**
 * @author Fran
 */
public class UnSegundoMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        int h = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int s = sc.nextInt();
        sc.close();

        System.out.println(LocalTime.of(h, m, s).plusSeconds(1));

    }
}
