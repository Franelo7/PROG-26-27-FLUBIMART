package ud2.ejercicios.metodos;

/**
 * @author Fran
 *         EsVocal
 */

public class EsVocal {
    public static void main(String[] args) {
        String letra = "B";
        System.out.println(esVocal(letra));
    }

    public static boolean esVocal(String letra) {
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u" || letra == "á" || letra == "é"
                || letra == "í" || letra == "ó" || letra == "ú" || letra == "A" || letra == "E" || letra == "I"
                || letra == "O" || letra == "U" || letra == "Á" || letra == "É"
                || letra == "Í" || letra == "Ó" || letra == "Ú" || letra == "ä" || letra == "ë" || letra == "ï"
                || letra == "ö" || letra == "ü" || letra == "Ä" || letra == "Ë"
                || letra == "Ï" || letra == "Ö" || letra == "Ü") {
            return true;
        }
        return false;
    }
}
