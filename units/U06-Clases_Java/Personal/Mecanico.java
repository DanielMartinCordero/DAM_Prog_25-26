package Personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    public void mostrarInformacion(){
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("Su teléfono es: "+this.telefono);
        System.out.println("Su especialidad es: "+this.especialidad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
