public class ej49 {
    public static void main(String[] args) {
        /*
Un  ángulo  se  considera  agudo  si  es  menor  de  90 
grados, obtuso si es mayor de 90 grados y recto si 
es  igual  a  90  grados.  Utilizando  esta  información, 
escribir un algoritmo que acepte un ángulo en grados 
y visualice el tipo de ángulo correspondiente a los 
grados introducidos.
         */
        int a = 100;
        if (a < 90){
            System.out.println("El ángulo es agudo");
        }else if(a > 90){
            System.out.println("El ángulo es obtuso");
        }else{
            System.out.println("El ángulo es recto");
        }
    }
}
