import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objeto
        Operaciones objOp1 = new Operaciones(15, 14);

        // acceder el metodo sumar
        System.out.println("Suma: " + objOp1.sumar());
        System.out.println("Resta: " + objOp1.restar());
        System.out.println("Multiplicacion: " + objOp1.multiplicar());
        System.out.println("Division: " + objOp1.dividir());

        Operaciones objOp2 = new Operaciones(15, 0);
        System.out.println("Division: " + objOp2.dividir());

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer número entero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite el segundo número entero: ");
        int n2 = sc.nextInt();

        Operaciones objOp3 =  new Operaciones(n1, n2);
        //a = objOp3.inputInt();
        //b = objOp3.inputInt();

        System.out.println("Suma: " + objOp3.sumar());
        System.out.println("Resta: " + objOp3.restar());
        System.out.println("Multiplicacion: " + objOp3.multiplicar());
        System.out.println("Division: " + objOp3.dividir());

        sc.close();
    }
}
