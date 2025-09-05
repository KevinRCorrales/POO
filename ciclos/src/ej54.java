import java.util.Scanner;

public class ej54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cuenta = 0;
        int sumaNumeros = 0;
        int numero;
        do {
            System.out.print("Ingresa un número: ");
            numero = input.nextInt();
            if (numero > 0) {
                sumaNumeros += numero;
                cuenta++;
            }
            // NUMERO NO POSITIVO; el 0 es neutro, no negativo ni positivo, por ende no se debe aceptar
        } while (numero > 0);
        if (sumaNumeros == 0) {
            System.err.println("No se ingresaron valores positivos");
        } else {
            System.out.println("Media: " + (double) sumaNumeros / (double) cuenta);
        }
        input.close();
    }
}
