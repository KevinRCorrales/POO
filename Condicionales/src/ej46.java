import java.util.Scanner;

public class ej46 {
    public static void main(String[] args) {
        /*
Diseñar un programa en el que a partir de una fecha 
introducida  por  teclado  con  el  formato  DIA,  MES, 
AÑO se obtenga la fecha del día siguiente.
        */
        Scanner fechas = new Scanner(System.in);
        System.out.print("Ingresa el día: ");
        int dia = fechas.nextInt();
        System.out.print("Ingresa el mes: ");
        int mes = fechas.nextInt();
        System.out.print("Ingresa el año: ");
        int anio = fechas.nextInt();
        fechas.close();

        if ((dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10))) {
            dia = 1;
            mes += 1;
        } else if (dia == 28 && mes == 2 && !esBisiesto(anio)) {
            dia = 1;
            mes += 1;
        } else if (dia == 29 && mes == 2 && esBisiesto(anio)) {
            dia = 1;
            mes += 1;
        } else if (mes == 12 && dia == 31) {
            dia = 1;
            mes = 1;
            anio += 1;
        } else {
            dia += 1;
        }

        System.out.println("Fecha siguiente: "+dia+"/"+mes+"/"+anio);
    }

    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            return true;
        }
        return false;
    }
}
