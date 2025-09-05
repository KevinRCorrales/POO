public class ej55 {
    public static void main(String[] args) {
        for (int i=2; i<=1000; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean esPrimo(int n) {
        int c = 2;
        while (c <= n / 2) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
