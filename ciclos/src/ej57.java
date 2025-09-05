import java.util.Scanner;

public class ej57 {
    public static void main(String[] args) {
        // Fork de 5.6
        Scanner notas = new Scanner(System.in);
        int calificacion;
        int notables = 0;
        do {
            System.out.print("Ingrese la calificación (o -1 para salir): ");
            calificacion = notas.nextInt();
            if (calificacion >= 7 && calificacion < 9 /* Validar que la nota sea válida */) {
                notables++;
            } else if ((calificacion < 0 && calificacion != -1) || calificacion > 10) /* Validar que la nota no sea negativa a excepción de cuando se desee salir */ {
                System.err.println("Ingrese una calificación válida.");
            }
        } while (calificacion != -1);
        System.out.println("Número total de NOTABLES: " + notables);
        notas.close();
    }
}
