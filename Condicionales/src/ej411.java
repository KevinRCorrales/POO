public class ej411 {
    public static void main(String[] args) {
        /*
Escribir  un  programa  que  seleccione  la  operación 
aritmética a ejecutar entre dos números dependiendo 
del  valor  de  una  variable  denominada 
seleccionOp.
         */
        int numero1 = 7;
        int numero2 = 20;
        char seleccionOp = '/';

        if (seleccionOp == '*') {
            System.out.println(numero1 * numero2);
        } else if (seleccionOp == '/') {
            System.out.println((double) numero1 / (double) numero2); // Convertir valores a decimal para que la división no sea entera y termine dando 0
        } else if (seleccionOp == '+') {
            System.out.println(numero1 + numero2);
        } else if (seleccionOp == '-') {
            System.out.println(numero1 - numero2);
        } else {
            System.out.println("Tipo de operación no soportado.");
        }
    }
}
