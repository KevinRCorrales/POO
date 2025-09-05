import java.util.Scanner;

public class ej58 {
    public static void main(String[] args) {
        int positivos = 0, negativos = 0, sumaPositivos = 0, sumaNegativos = 0;
        Scanner numeros = new Scanner(System.in);
        for (int i=1; i<=100; i++) {
            System.out.print(i + ". Ingrese un número: ");
            int numero = numeros.nextInt();
            if (numero > 0) {
                positivos++;
                sumaPositivos += numero;
            } else if (numero < 0) {
                negativos++;
                sumaNegativos += numero;
            }
        }
        double mediaPositivos = (double) sumaPositivos / (double) positivos;
        double mediaNegativos = (double) sumaNegativos / (double) negativos;
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        numeros.close();
    }
}
