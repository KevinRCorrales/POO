public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;
    private double altura; // Nueva variable necesaria para calcular el IMC

    // Constructor, tiene el mismo nombre de la clase e inicializa la clase
    public Persona(String nombre, String apellido, int edad, int cedula, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Persona: [ Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Cédula: " + cedula + " Peso: " + peso + " ]";
    }

    public String saludar() {
        return "Hola, mi nombre es " + nombre + ", un gusto.";
    }

    public boolean esMayorDeEdad()
    {
        if (edad >= 18) return true; 
        return false;
    }

    public double calcularIMC() {
        return peso / Math.pow(altura, 2);
    }
}