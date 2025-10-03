import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            String menuText = """
                Opciones disponibles:
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                5. Potencia
                6. Hipotenusa
                7. Área de triángulo
                8. Perimetro de cuadrilatero
                9. Promedio
                0. Salir""";
            System.out.println(menuText);
            System.out.print("Ingrese la opción que desea usar: ");
            opcion = sc.nextInt();
            if ((opcion > 9 || opcion < 1) && opcion != 0) {
                System.out.println("\nOpción no valida.\n");
            }
            else if (opcion == 0) {
                System.exit(0);
            } else {
                System.out.print("Ingrese el primer número: ");
                int numero1 = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int numero2 = sc.nextInt();
                Operaciones objOp1 = new Operaciones(numero1, numero2);
                switch (opcion) {
                    case 1:
                        System.out.println("Suma: " + objOp1.sumar());
                        break;
                    case 2:
                        System.out.println("Resta: " + objOp1.restar());
                        break;
                    case 3:
                        System.out.println("Multiplicación: " + objOp1.multiplicar());
                        break;
                    case 4:
                        System.out.println("División: " + objOp1.dividir());
                        break;
                    case 5:
                        System.out.println("Potencia: " + objOp1.potencia());
                        break;
                    case 6:
                        System.out.println("Hipotenusa: " + objOp1.hipotenusa());
                        break;
                    case 7:
                        System.out.println("Área del triángulo: " + objOp1.areaTriangulo());
                        break;
                    case 8:
                        System.out.println("Perimetro del cuadrilatero : " + objOp1.perimetroCuadrilatero());
                        break;
                    case 9:
                        System.out.println("Promedio: " + objOp1.promedio());
                        break;
                }
            }
        } while (opcion != 0);
        sc.close();
    }
}
