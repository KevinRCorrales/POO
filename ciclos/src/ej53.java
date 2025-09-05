public class ej53 {
    public static void main(String[] args) {
        int contadorI = 0;
        for (int i = 1; i <= 100; i++) {
            contadorI += i;
        }
        System.out.println(contadorI);
        System.out.println("--------------------------------------------");
        int j = 1, contadorJ = 0;
        while (j <= 100) {
            contadorJ += j;
            j++;
        }
        System.out.println(contadorJ);
        System.out.println("--------------------------------------------");
        int p = 1, contadorP = 0;
        do {
            contadorP += p;
            p++;
        } while (p <= 100);
        System.out.println(contadorP);
    }
}
