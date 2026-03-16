package a05;

public class Gestor {
    public String nombre;
    private String telefono;
    double importeMax;

    Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = 10000;
    }

    Gestor(String nombre, String telefono, double importeMax) {
        this(nombre, telefono);
        this.importeMax = importeMax;
    }
    void mostrarDatos(){
        System.out.println("Nombre del gestor: " + this.nombre);
        System.out.println("Teléfono del gestor: " + this.telefono);
        System.out.println("Importe máximo para el que está autorizado: " + this.importeMax);
    }
    String getNombre(){
        return nombre;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    double getImporteMax(){
        return importeMax;
    }
    void setImporteMax(double importeMax){
        this.importeMax = importeMax;
    }

}
