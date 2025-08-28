import java.util.Scanner;

public class ej48 {
    public static void main(String[] args) {
        /*
Realizar un algoritmo que averigüe si dados dos números
introducidos por teclado uno es divisor del otro.
 */
        Scanner numeroLector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = numeroLector.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = numeroLector.nextInt();
        numeroLector.close();

        if (numero1 % numero2 == 0) {
            System.out.println("El número " + numero2 + " es divisor de " + numero1);
        } else if (numero2 % numero1 == 0) {
            System.out.println("El número " + numero1 + " es divisor de " + numero2);
        } else {
            System.out.println("Ningún número ingresado es divisor del otro.");
        }
    }
}
