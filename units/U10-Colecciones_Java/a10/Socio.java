package a10;

public class Socio implements Comparable<Socio> {
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

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }
    @Override
    public int hashCode(){
        return dni.hashCode();
    }
    @Override
    public boolean equals(Object otro){
        return dni.equals(((Socio) otro).dni);
    }
}
