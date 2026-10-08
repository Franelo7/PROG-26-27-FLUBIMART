package ud2.ejercicios;

import java.util.Scanner;
/**
 * @author Fran
 */
public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un día (1 al 31):");
        int dia = sc.nextInt();
        System.out.println("Escriba un mes (1 al 12):");
        int mes = sc.nextInt();
        System.out.println("Escriba un año (no se considerarán bisiestos):");
        int anho = sc.nextInt();
        sc.close();
        if (anho % 4 != 0 && anho % 100 == 0 || anho % 400 != 0) {

            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("Fecha Correcta");
                    } else {
                        System.out.println("Fecha Incorrecta");
                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("Fecha Correcta");
                    } else {
                        System.out.println("Fecha Incorrecta");
                    }
                    break;

                case 4, 6, 9, 11:
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Fecha Correcta");
                    } else {
                        System.out.println("Fecha Incorrecta");
                    }
                    break;

                default:
                    System.out.println("Error: el mes es incorrecto");
                    break;
            }

        } else {
            System.out.println("El año es bisiesto");
        }
    }
}
