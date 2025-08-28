public class ej414 {
    public static void main(String[] args) {
        /*
Escriba un programa que simule el funcionamiento 
normal de un ascensor (elevador) moderno con 25 
pisos (niveles) y que posee dos botones de SUBIR y 
BAJAR, excepto en el piso (nivel) inferior, que sólo 
existe botón de llamada para SUBIR y en el último 
piso (nivel) que sólo existe botón de BAJAR.
         */
        int piso = 23;
        if (piso == 1) {
            System.out.println("SUBIR");
        } else if (piso == 25) {
            System.out.println("BAJAR");
        } else {
            System.out.println("SUBIR");
            System.out.println("BAJAR");
        }
    }
}
