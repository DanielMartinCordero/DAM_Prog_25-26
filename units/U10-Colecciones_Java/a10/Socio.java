package a10;

public class Socio {
    private String dni;
    private String nombre;
    Socio(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Socio{" + "DNI: " + dni + ", nombre: " + nombre + '}';
    }


}
