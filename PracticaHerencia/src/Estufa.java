public class Estufa extends Electrodomestico{
    protected boolean isElectrica;
    protected int cantidadQuemadores;

    public Estufa(String marca, int precio, boolean isElectrica, int cantidadQuemadores) {
        super(marca, precio);
        this.isElectrica = isElectrica;
        this.cantidadQuemadores = cantidadQuemadores;
    }

    // Reescribirt encender y printInfo

    @Override
    public void encender(){
        if (isElectrica){
            System.out.println("Energía detectada... Esperando encendido de algún quemador...");
        } else {
            System.out.println("Esta estufa no es eléctrica");
        }
    }

    @Override
    public void printInfo(){
        String electricidadInfo = (isElectrica) ? "Es eléctrica" : "No es eléctrica";
        System.out.println("Estufa Marca: " + marca + ", Precio: " + precio + ", " + electricidadInfo + ", Cantidad de quemadores: " + cantidadQuemadores);
    }
}
