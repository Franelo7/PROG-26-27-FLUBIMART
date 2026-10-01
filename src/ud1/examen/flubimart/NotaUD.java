package ud1.examen.flubimart;

import java.util.Scanner;

/**
 * @author Francisco José Lubián Martínez
 *         NotaUD
 */
public class NotaUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota de la prueba teórica: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduce la nota de la prueba práctica: ");
        double n2 = sc.nextDouble();
        System.out.print("Introduce la nota del trabajo en el aula: ");
        double n3 = sc.nextDouble();
        sc.close();
        double porcentajeTeorica = n1 * 0.4;
        double porcentajePractica = n2 * 0.6;
        double notaAprobado = n1 >= 5 && n2 >= 5 && n3 != -1 ? (porcentajePractica + porcentajeTeorica + n3 * 0.2) / 1.2
                : porcentajePractica + porcentajeTeorica;
        double notaSuspenso = porcentajePractica + porcentajeTeorica < 5 && porcentajePractica + porcentajeTeorica >= 4
                ? 4
                : porcentajePractica + porcentajeTeorica;
        double notaFinal = notaAprobado >= 5 ? notaAprobado : notaSuspenso;
        System.out.printf("La nota final del alumno en la UD es de: %.2f", notaFinal);
    }
}
