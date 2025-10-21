public class Nevera extends Electrodomestico{
    protected boolean isNevecon;
    protected boolean isFrost;

    public Nevera(String marca, int precio, boolean isNevecon, boolean isFrost) {
        super(marca, precio);
        this.isNevecon = isNevecon;
        this.isFrost = isFrost;
    }

    @Override
    public void encender(){
        System.out.println("Energía detectada... Empezando refrigeración...");
    }

    @Override
    public void printInfo(){
        // Condiciones para no mostrar booleanos al usuario
        String frostInfo = (!isFrost) ? "No es Frost" : "Sí es Frost";
        String neveconInfo = (!isNevecon) ? "No es Nevecon" : "Sí es Nevecon";
        System.out.println("Nevera Marca: " + marca + ", Precio: " + precio + ", " + frostInfo + ", " + neveconInfo);
    }
}
