import java.util.Scanner;

public class ej52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mes;
        do {
            System.out.print("Ingresa un mes: ");
            mes = input.nextLine();
        } while (!mesValido(mes));
        System.out.print("Ingresa un año: ");
        int anio = input.nextInt();
        if (mes.equals("febrero") && esBisiesto(anio)) {
            System.out.println("El mes tiene 29 días.");
        } else if (mes.equals("febrero") && !esBisiesto(anio)) {
            System.out.println("El mes tiene 28 días.");
        } else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            System.out.println("El mes tiene 30 días");
        } else if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            System.out.println("El mes tiene 31 días.");
        }
        input.close();
    }
    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            return true;
        }
        return false;
    }
    public static boolean mesValido(String mes) {
        if (mes.equals("enero") || mes.equals("febrero") || mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo") || mes.equals("junio") || mes.equals("julio") || mes.equals("agosto") || mes.equals("septiembre") || mes.equals("octubre") || mes.equals("noviembre") || mes.equals("diciembre")) {
            return true;
        }
        System.out.println("Ingresa un mes válido.");
        return false;
    }
}
