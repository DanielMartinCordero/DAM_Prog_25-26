package a00;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String nacionalidad;
    Persona(String nombre, int edad, double estatura, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Estatura: " + this.estatura);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
    protected void cumplirAños(){
        ++edad;
    }
    public String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    protected void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    protected void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    protected void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
