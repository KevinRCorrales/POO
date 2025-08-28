public class ej45 {
    public static void main(String[] args) {
        /*
Escribir  los  diferentes  métodos  para  deducir  si  una 
variable o expresión numérica es par.
         */
        comprobar(4);
        comprobar(7);
    }

    public static void comprobar(int numeroComprobar) {
        if (numeroComprobar % 2 == 0) {
            System.out.println("El número " + numeroComprobar + " es par");
        } else {
            System.out.println(numeroComprobar + " no es par");
        }
    }
}
