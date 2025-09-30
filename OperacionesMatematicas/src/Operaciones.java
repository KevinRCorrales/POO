//import java.util.Scanner;

public class Operaciones {
    // atributos
    private int a;
    private int b;

    // constructor
    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // métodos
    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public double dividir() {
        if (b == 0) return 0;
        return (double) a / (double) b;
    }

    /*
    public int inputInt() {
        Scanner sc = new Scanner(System.in);
        IO.print("Digite el entero: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
    */
}
