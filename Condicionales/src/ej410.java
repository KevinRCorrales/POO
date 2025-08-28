public class ej410 {
    public static void main(String[] args) {
        /*
El  sistema  de  calificación  americano  (de  Estados 
Unidos)  se  suele  calcular  de  acuerdo  al  siguiente 
cuadro:
Grado numérico Grado                      en letra
Grado mayor o igual a 90                  A
Menor de 90 pero mayor o igual a 80       B
Menor de 80 pero mayor o igual a 70       C
Menor de 70 pero mayor o igual a 69       D
Menor de 69                               F

Utilizando  esta  información,  escribir  un  algo-
ritmo que acepte una calificación numérica del es-
tudiante  (0-100),  convierta  esta  calificación  a  su 
equivalente en letra y visualice la calificación corres-
pondiente en letra.
*/
        int calificacion = 70;

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("A");
        } else if (calificacion < 90 && calificacion >= 80) {
            System.out.println("B");
        } else if (calificacion < 80 && calificacion >= 70) {
            System.out.println("C");
        } else if (calificacion < 70 && calificacion >= 69) {
            System.out.println("D");
        } else if (calificacion < 69 && calificacion >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Calificación no válida.");
        }
    }
}
