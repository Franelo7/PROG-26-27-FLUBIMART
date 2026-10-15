package ud2.ejercicios.bucles;

import java.util.Scanner;

public class ArbolMasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la etiqueta del árbol");
        String etiqueta = sc.nextLine();
        System.out.println("Introduce la altura del árbol: ");
        int h = sc.nextInt();
        int hMax = 0;
        String eMax = "";
        while (!etiqueta.isEmpty() || h != -1) {
            if (hMax == 0) {
                hMax = h;
                eMax = etiqueta;
            } else if (h > hMax) {
                hMax = h;
                eMax = etiqueta;
            }
            System.out.println("Introduce la etiqueta del árbol");
            etiqueta = sc.nextLine();
            sc.next();
            System.out.println("Introduce la altura del árbol: ");
            h = sc.nextInt();
        }
        System.out.println(eMax);
        System.out.println(hMax);
    }
}
