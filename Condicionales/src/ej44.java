public class ej44 {
    public static void main(String[] args) {
        /*
Calcular la raíz cuadrada de un número y escribir su 
resultado. Considerando el caso en que el número sea 
negativo.
         */

        raiz(16.0);
        raiz(-49.0);
    }
    
    public static void raiz(double numero) {
        if (numero >= 0) {
            System.out.println(Math.sqrt(numero));
        }
        else {
            System.out.println("El número ingresado es negativo, no se puede calcular raíz cuadrada.");
        }
    }
}
