public class Main{
    public static void main(String[] args) {
        Electrodomestico tvModeloJ210dd = new Televisor("Samsung", 3_000_000, 70.0, "4K");
        tvModeloJ210dd.printInfo();
        tvModeloJ210dd.encender();

        Electrodomestico neveraPkcls23 = new Nevera("IBG", 2500000, false, true);
        neveraPkcls23.printInfo();
        neveraPkcls23.encender();

        Electrodomestico tvModeloPpqdkd = new Televisor("Kalley", 4000000, 80, "Full HD");
        tvModeloPpqdkd.encender();
        tvModeloPpqdkd.printInfo();

        Electrodomestico estufaUkc2309 = new Estufa("Haceb", 1000000, true, 6);
        estufaUkc2309.encender();
        estufaUkc2309.printInfo();

        Electrodomestico estufaUdknoed2093 = new Estufa("Haceb", 1200000, false, 4);
        estufaUdknoed2093.printInfo();
        estufaUdknoed2093.encender();
    }
}