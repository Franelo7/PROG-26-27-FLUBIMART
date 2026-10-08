package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 * DiaDeLaSemana
 */
public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de la semana en número entero: ");
        int n = sc.nextInt();
        sc.close();
        switch (n) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
