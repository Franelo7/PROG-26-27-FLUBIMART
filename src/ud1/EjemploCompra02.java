package ud1;

public class EjemploCompra02 {
    public static void main(String[] args) {
        double importeUnidad = 10.00;
        int amount = 5;
        double importeTotal = importeUnidad * amount;
        double IVA = 0.21;
        System.out.println("");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Importe: " + importeUnidad + "$");
        System.out.println("Cantidad: " + amount   + "uds");
        System.out.println("Total: " + importeTotal + "$");
        System.out.println("IVA: " + (IVA*importeTotal) + "$");
        System.out.println("===============================");
        System.out.println("Importe Final: " + (importeTotal + (IVA*importeTotal)) + "$");
        System.out.println("===============================");
        System.out.println("");
    }
}


