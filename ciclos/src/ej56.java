import java.util.Scanner;

public class ej56 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        int calificacion;
        int aprobados = 0;
        do {
            System.out.print("Ingrese la calificación (o -1 para salir): ");
            calificacion = notas.nextInt();
            if (calificacion >= 5 && calificacion <= 10 /* Validar que la nota sea válida (no mayor a 10) */) {
                aprobados++;
            } else if ((calificacion < 0 && calificacion != -1) || calificacion > 10) /* Validar que la nota no sea negativa a excepción de cuando se desee salir */ {
                System.err.println("Ingrese una calificación válida.");
            }
        } while (calificacion != -1);
        System.out.println("Número total de aprobados: " + aprobados);
        notas.close();
    }
}
