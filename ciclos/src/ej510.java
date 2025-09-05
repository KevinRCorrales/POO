import java.util.Scanner;

public class ej510 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dias = 0, erroneos = 0, correctos = 0, maxSuma = 0, minSuma= 0;
        int minima, maxima;
        do {
            System.out.print("Ingresa la temperatura mínima: ");
            minima = leer.nextInt();
            System.out.print("Ingresa la temperatura máxima: ");
            maxima = leer.nextInt();
            dias++;
            if (minima == 9 || maxima == 9) {
                erroneos++;
                System.err.println("Se cometió un error aquí...");
            } else {
                correctos++;
                maxSuma += maxima;
                minSuma += minima;
                System.out.println("Se ingresaron resultados correctos...");
            }
        } while (minima != 0 || maxima != 0);
        double porcentaje = ((double) erroneos / (double) dias) * 100.0;
        double mediaMax = (double) maxSuma / (double) correctos;
        double mediaMin = (double) minSuma / (double) correctos;
        System.out.println("Las temperaturas se proporcionaron durante"  + dias + "días.");
        System.out.println("La media de las temperaturas máximas es: " + mediaMax + ", y la media de las temperaturas mínimas es: " + mediaMin);
        System.out.println("El número de errores fue: " + erroneos + ", lo que representó un porcentaje del " + porcentaje + "% de errores.");
        leer.close();
    }
}
