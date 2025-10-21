public class Televisor extends Electrodomestico{
    protected double pulgadas;
    protected String calidadImagen;

    public Televisor(String marca, int precio, double pulgadas, String calidadImagen) {
        super(marca, precio);
        this.pulgadas = pulgadas;
        this.calidadImagen = calidadImagen;
    }

    // Reescribirt encender y printInfo

    @Override
    public void encender(){
        System.out.println("Enchufe conectado... Esperando señal del control remoto...");
    }

    @Override
    public void printInfo(){
        System.out.println("TV Marca: " + marca + ", Precio: " + precio + ", Pulgadas: " + pulgadas + ", Calidad imagen: " + calidadImagen);
    }
}
