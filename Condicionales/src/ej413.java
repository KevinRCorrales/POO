import java.util.Scanner;

public class ej413 {
    public static void main(String[] args) {
        /*
Escribir un algoritmo que visualice el siguiente doble mensaje
Introduzca un mes (1 para Enero, 2 para 
Febrero,…)
Introduzca un día del mes

El algoritmo acepta y almacena un número en la 
variable  mes  en  respuesta  a  la  primera  pregunta  y 
acepta y almacena un número en la variable dia en 
respuesta a la segunda pregunta. Si el mes introducido 
no está entre 1 y 12 inclusive, se debe visualizar un 
mensaje de información al usuario advirtiéndole de 
que el número introducido no es válido como mes; de 
igual forma se procede con el número que representa 
el día del mes si no está en el rango entre 1 y 31.
Modifique el algoritmo para prever que el usuario 
introduzca números con decimales.

Nota: como los años bisiestos, febrero tiene 29 
días, modifique el programa de modo que advierta al 
usuario si introduce un día de mes que no existe (por 
ejemplo, 30 o 31). Considere también el hecho de que 
hay meses de 30 días y otros meses de 31 días, de 
modo que nunca se produzca error de introducción 
de datos o que en su defecto se visualice un mensaje 
al usuario advirtiéndole del error cometido. */

        Scanner fecha = new Scanner(System.in);
        System.out.print("Introduzca un mes: ");
        int mes = fecha.nextInt();
        System.out.print("Introduzca un día del mes: ");
        int dia = fecha.nextInt();

        if (mes < 1 || mes > 12) {
            System.err.println("El mes que ingresó no es un mes válido.");
        } else if (dia < 1) {
            System.err.println("Ingresó un día negativo, lo cual no es válido.");
        } else if (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.err.println("El mes que ingresó solo tiene hasta 30 días.");
        } else if (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            System.err.println("El mes que ingresó solo tiene hasta 31 días.");
        } else if (mes == 2 && dia > 29) {
            System.err.println("Ingresó un día no válido para febrero.");
        } else {
            System.out.println("Fecha válida.");
        }
        fecha.close();
    }
}
