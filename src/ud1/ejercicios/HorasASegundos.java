package ud1.ejercicios;

import java.util.Scanner;

public class HorasASegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de segundos: ");
        int s = sc.nextInt();
        sc.close();
        int horas = s / 3600;
        int minutos = s % 3600 / 60;
        int segundos = s % 60;
        System.out.println(horas + " " + minutos + " " + segundos);
    }
}
