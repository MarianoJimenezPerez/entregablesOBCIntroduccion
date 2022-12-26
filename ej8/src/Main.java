public class Main {
    public static void main(String[] args) {
        Persona mariano = new Persona();
        mariano.setNombre("mariano");
        mariano.setEdad(24);
        mariano.setTelefono(123);

        System.out.println(mariano.getEdad());
        System.out.println(mariano.getNombre());
        System.out.println(mariano.getTelefono());
    }


}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;


    //edad encap
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //nombre encap
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //telefono encap
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}