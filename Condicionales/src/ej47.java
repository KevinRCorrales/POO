import java.util.Scanner;

public class ej47 {
    public static void main(String[] args) {
        /*
Se desea realizar una estadística de los pesos de los 
alumnos de un colegio de acuerdo a la siguiente tabla:
Alumnos de menos de 40 kg.
Alumnos entre 40 y 50 kg.
Alumnos de más de 50 kg y menos de 60 kg.
Alumnos de más o igual a 60 kg.
         */
        Scanner recibirPeso = new Scanner(System.in);
        boolean activo = true;
        int menores40 = 0;
        int entre40y50 = 0;
        int entre50y60 = 0;
        int masoigual60 = 0;

        do {
            System.out.print("Ingrese el peso, si desea salir y ver resultados, ingrese 0: ");
            int peso = recibirPeso.nextInt();
            if (peso < 0) {
                System.out.println("Por favor, ingrese un peso válido.");
            } else if (peso == 0) {
                activo = false;
            } else if (peso < 40) {
                menores40 += 1;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50 += 1;
            } else if (peso > 50 && peso < 60) {
                entre50y60 += 1;
            } else {
                masoigual60 += 1;
            }
        } while (activo);

        System.out.println("\nResultados:");
        System.out.println("Alumnos de menos de 40 kg: " + menores40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos de más o igual a 60 kg: " + masoigual60);

        recibirPeso.close();
    }
}
