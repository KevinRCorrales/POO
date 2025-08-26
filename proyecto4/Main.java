import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ejercicio 4.1

        // Parte A
        System.out.print("Ingresa el valor de un ángulo: ");
        int ang = input.nextInt();
        input.nextLine(); // Limpiar el bufer
        if (ang == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        // Parte B
        System.out.print("Ingresa el valor de una temperatura: ");
        int temp = input.nextInt();
        if (temp > 100){
            System.out.println("Por encima del punto de ebullición del agua");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }

        // Parte C
        int pos = 0;
        int neg = 0;
        int num = input.nextInt();
        if (num > 0){
            pos += num;
        } else {
            neg += num;
        }
        System.out.println("La suma de los positivos es: " + pos);
        System.out.println("La suma de los negativos es: " + neg);

        // Parte D
        System.out.print("Ingresa x: ");
        int x = input.nextInt();
        System.out.print("Ingresa y: ");
        int y = input.nextInt();
        System.out.print("Ingresa z: ");
        int z = input.nextInt();
        if (x > y && z < 20) {
            System.out.print("Ingresa un valor para p: ");
            int p = input.nextInt();
            System.out.println("El valor de p es: " + p);
        } else {
            System.out.println("No se leerá el valor de p.");
        }

        // Parte E
        System.out.print("Ingrese un valor de distancia: ");
        int dist = input.nextInt();
        if (dist > 20 && dist < 35) {
            System.out.print("Ingrese un valor de tiempo: ");
            int tiempo = input.nextInt();
            System.out.println("Tiempo: " + tiempo);
        } else {
            System.out.println("No se leerá el tiempo");
        }

        input.close(); // Cerrar para ahorrar recursos
    }
}