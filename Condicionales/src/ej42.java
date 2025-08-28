import java.util.Scanner;

public class ej42 {
    public static void main(String[] args) {
        /*
Escribir un programa que solicite al usuario introducir 
dos números. Si el primer número introducido es ma-
yor que el segundo número, el programa debe impri-
mir el mensaje 
El primer número es el mayor, 
en caso contrario el programa debe imprimir el men-
saje El  primer  número  es  el  más  pequeño. 
Considerar el caso de que ambos números sean igua-
les e imprimir el correspondiente 
mensaje.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer número es el mayor");
        } else if (numero1 < numero2){
            System.out.println("El primer número es el más pequeño");
        } else {
            System.out.println("Ambos números son iguales");
        }
        input.close();
    }
}