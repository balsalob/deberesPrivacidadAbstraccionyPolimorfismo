public class Main {
    public static void main(String[] args) {

        //Declaración de la persona

        Persona pepe = new Persona(38, "pepe", 666666666);

        //getters de los datos pasado con el constructor

        System.out.println(Integer.toString(pepe.getEdad()));
        System.out.println(pepe.getNombre());
        System.out.println(Integer.toString(pepe.getTelefono()));

        //usamos los setters para cambiar los datos

        pepe.setEdad(25);
        pepe.setNombre("pepelu");
        pepe.setTelefono(914445566);

        //getters para ver los datos nuevos

        System.out.println(Integer.toString(pepe.getEdad()));
        System.out.println(pepe.getNombre());
        System.out.println(Integer.toString(pepe.getTelefono()));

    }
}

