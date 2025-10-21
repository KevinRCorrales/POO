public class Electrodomestico {
    protected String marca;
    protected int precio;

    // Constructor
    public Electrodomestico(String marca, int precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // Metodo para encender de acuerdo al tipo de producto
    public void encender(){
        System.out.println("Encendiendo electrodomestico...");
    }

    // Método para mostrar información general
    public void printInfo() {
        System.out.println("Marca: " + marca + ", Precio: " + precio);
    }
}
