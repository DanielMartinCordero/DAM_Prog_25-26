package Personal;

public class JefeEstacion {
    private String dni;
    private String nombre;
    private String fechaNombramiento;

    public JefeEstacion(String dni, String nombre, String fechaNombramiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNombramiento = fechaNombramiento;
    }
    public void mostrarInformacion(){
        System.out.println("El DNI es: "+this.dni);
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("Fue nombrado en: "+this.fechaNombramiento);
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNombramiento() {
        return fechaNombramiento;
    }
    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
}
