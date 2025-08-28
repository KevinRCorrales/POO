import java.util.Scanner;

public class ej412 {
    public static void main(String[] args) {
        /*
Escribir un programa que acepte dos números reales 
de un usuario y un código de selección. Si el código 
introducido de selección es 1, entonces el programa 
suma los dos números introducidos previamente y se 
visualiza el resultado; si el código de selección es 2, 
los números deben ser multiplicados y visualizado 
el resultado; y si el código seleccionado es 3, el pri-
mer número se debe dividir por el segundo número 
y visualizarse el resultado. */

        Scanner numeros = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double numero1 = numeros.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = numeros.nextDouble();
        System.out.print("Ingresa el código: ");
        int codigo = numeros.nextInt();

        if (codigo == 1) {
            System.out.println(numero1 + numero2);
        } else if (codigo == 2) {
            System.out.println(numero1 * numero2);
        } else if (codigo == 3) {
            System.out.println(numero1 / numero2);
        } else {
            System.out.println("Código no válido.");
        }
        numeros.close();
    }
}
