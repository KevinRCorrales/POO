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

    // 5 operaciones adicionales

    public double potencia() {
        return Math.pow(a, b);
    }

    public double hipotenusa() {
        return Math.hypot(a, b);
    }

    public double areaTriangulo() {
        return (double) (a * b) / 2.0;
    }

    public double perimetroCuadrilatero() {
        return 2 * a + 2 * b;
    }

    public double promedio() {
        return (double) (a + b) / 2.0;
    }
}
