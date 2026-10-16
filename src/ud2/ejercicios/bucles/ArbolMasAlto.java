package ud2.ejercicios.bucles;

import java.util.Scanner;

public class ArbolMasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String etiqueta;

        int h;
        int hMax = 0;
        String eMax = "";

        do {
            System.out.println("Introduce la etiqueta del árbol");
            etiqueta = sc.nextLine();

            System.out.println("Introduce la altura del árbol: ");
            h = Integer.parseInt(sc.nextLine());

            if (hMax == 0) {
                hMax = h;
                eMax = etiqueta;
            } else if (h > hMax) {
                hMax = h;
                eMax = etiqueta;
            }

        } while (!etiqueta.isEmpty() && h != -1);
        sc.close();
        System.out.println(eMax);
        System.out.println(hMax);
    }
}
