package a00;

public class Empleado extends Persona{
    private double salario;
    Empleado(String nombre, int edad, double estatura, String nacionalidad, double salario){
        super(nombre, edad, estatura, nacionalidad);
        this.salario = salario;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Salario: "+salario);
    }
    public void cambiarEstatura(double estatura){
        super.setEstatura(estatura);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
