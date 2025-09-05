import java.util.Scanner;

public class ej59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ficha;
        int numeroArticulosA = 0, numeroArticulosB = 0, importeA = 0, importeB = 0;
        do {
            System.out.print("Ingrese el código del artículo: ");
            ficha = sc.nextLine();
            if (!ficha.equals("A") && !ficha.equals("B")) {
                System.err.println("Ingrese un código válido.");
            } else if (ficha.equals("X")) {
                continue;
            } else {
                System.out.print("Ingrese el precio unitario del artículo: ");
                int precio = sc.nextInt();
                System.out.print("Ingrese la cantidad de artículos: ");
                int articuloCantidad = sc.nextInt();
                sc.nextLine(); // Limpiar búfer para la próxima entrada
            
                if (ficha.equals("A")) {
                    numeroArticulosA = articuloCantidad;
                    importeA = precio * numeroArticulosA;
                } else if (ficha.equals("B")) {
                    numeroArticulosB = articuloCantidad;
                    importeB = precio * numeroArticulosB;
                }
            }
        } while (!ficha.equals("X"));
        System.out.println("En la categoría A existe un total de " + numeroArticulosA + " productos con un importe total de $" + importeA + "\n");
        System.out.println("En la categoría B existe un total de " + numeroArticulosB + " productos con un importe total de $" + importeB);
        sc.close();
    }
}
