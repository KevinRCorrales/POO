public class Main {
    public static void main(String[] args) {
        Persona objPersona1;
        objPersona1 = new Persona("Kevin", "Ramírez", 15, 1230987456, 48, 1.60);

        Persona objPersona2 = new Persona("Carlos", "Corrales", 40, 21348934, 56, 1.90);

        System.out.println(objPersona1.toString());
        System.out.println(objPersona2.toString());

        // solo el nombre de una persona
        System.out.println(objPersona1.getNombre());

        // modificar un nombre
        objPersona2.setNombre("Alberto");
        System.out.println(objPersona2.toString());
        System.out.println(objPersona2.getNombre());

        /* Tarea: 
         * Crear 3 objetos más de la clase Persona
         * Crear los metodos get y set para los atributos que faltan
         * Crear el metodo saludar que retorne un saludo con el nombre de la persona
         * Crear el metodo esMayorDeEdad que retorne true si la persona es mayor de edad (18 años) y false si no lo es
         * Crear el metodo calcularIMC que retorne el indice de masa corporal (IMC) de la persona
         * IMC = peso (kg) / (altura (m) * altura (m))
         * Mostrar por pantalla los resultados de los nuevos metodos
         */

        var persona3 = new Persona("Mateo", "Velásquez", 20, 1111111111, 40, 1.50);
        var persona4 = new Persona("Ryan", "Martínez", 35, 383838383, 50, 1.85);
        var persona5 = new Persona("Gloria", "Rodríguez", 60, 993939393, 50, 1.60);

        System.out.println(persona3.calcularIMC());
        System.out.println(persona4.esMayorDeEdad());
        System.out.println(persona5.saludar());

        System.out.println("\n");

        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getEdad());
        System.out.println(persona3.getCedula());
        System.out.println(persona3.getAltura());
        System.out.println(persona3.getPeso());

        System.out.println("\n");

        System.out.println(persona4.getNombre());
        System.out.println(persona4.getApellido());
        System.out.println(persona4.getEdad());
        System.out.println(persona4.getCedula());
        System.out.println(persona4.getAltura());
        System.out.println(persona4.getPeso());

        System.out.println("\n");

        System.out.println(persona5.getNombre());
        System.out.println(persona5.getApellido());
        System.out.println(persona5.getEdad());
        System.out.println(persona5.getCedula());
        System.out.println(persona5.getAltura());
        System.out.println(persona5.getPeso());

        persona5.setNombre("Antonio");
        persona5.setApellido("Corrales");
        persona5.setCedula(1292292929);
        persona5.setAltura(1.59);
        persona5.setEdad(61);
        persona5.setPeso(49);

        System.out.println("\n");

        System.out.println(persona5.getNombre());
        System.out.println(persona5.getApellido());
        System.out.println(persona5.getEdad());
        System.out.println(persona5.getCedula());
        System.out.println(persona5.getAltura());
        System.out.println(persona5.getPeso());
    }
}
