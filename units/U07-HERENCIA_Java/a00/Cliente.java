package a00;

public class Cliente extends Persona{
    private double presupuesto;
    Cliente(String nombre, int edad, double estatura, String nacionalidad, double presupuesto){
        super(nombre, edad, estatura, nacionalidad);
        this.presupuesto = presupuesto;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Presupuesto: "+presupuesto);
    }
    public void cambiarNacionalidad(String nacionalidad){
        super.setNacionalidad(nacionalidad);
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
