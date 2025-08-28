public class ej43 {
    public static void main(String[] args) {
        /*
Dados tres números deducir cuál es el central.
         */
        int numero1 = 15;
        int numero2 = 6;
        int numero3 = 15;
        int central = 0;

        if ((numero1 > numero2 && numero3 < numero2) || (numero1 < numero2 && numero3 > numero2)) {
            central = numero2;
        } else if ((numero2 > numero1 && numero3 < numero1) || (numero2 < numero1 && numero3 > numero1)) {
            central = numero1;
        } else if ((numero3 > numero1 && numero3 < numero2) || (numero3 < numero1 && numero3 > numero2)) {
            central = numero3;
        } else {
            System.err.println("No hay un número central, dos o más números son iguales.");
            System.exit(1);
        }
        System.out.println("El número central es: " + central);
    }
}