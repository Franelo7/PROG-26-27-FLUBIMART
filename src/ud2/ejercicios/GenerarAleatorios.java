package ud2.ejercicios;

import java.util.Random;

/**
 * @author Fran
 *         GenerarAleatorios
 */
public class GenerarAleatorios {
    public static void main(String[] args) {
        numerosAleatorios(5, 0, 100);
    }

    static void numerosAleatorios(int nNumerosAleatorios, int rangoMinimo, int rangoMaximo) {
        Random rnd = new Random();

        for (int i = 0; i < nNumerosAleatorios; i++) {
            System.out.println(rnd.nextInt(rangoMinimo, rangoMaximo + 1));
        }
    }
}
