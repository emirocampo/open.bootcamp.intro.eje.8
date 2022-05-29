public class Main {
    public static void main(String[] args) {

        System.out.println("ejercicio tema 8");
        Persona persona1 = new Persona();
        persona1.setNombre("emiro");
        persona1.setEdad(30);
        persona1.setTelefono(300555667);
        System.out.println("nombre: "+persona1.getNombre());
        System.out.println("edad: "+persona1.getEdad());
        System.out.println("telefono: "+persona1.getTelefono());
    };

}

class Persona{
    private int edad;
    private String nombre;
    private long telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}