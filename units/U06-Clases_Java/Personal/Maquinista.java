package Personal;

public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    public void mostrarInformacion(){
        System.out.println("El DNI es: "+this.dni);
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("Tiene un sueldo de: "+this.sueldo);
        System.out.println("Su rango es: "+this.rango);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
}
