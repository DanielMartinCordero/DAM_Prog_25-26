package Maquinaria;
import Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private short añoFabricacion;
    private Mecanico mecanicoAsignado;

    public Locomotora(String matricula, int potenciaMotor, short añoFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.añoFabricacion = añoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }
    public void mostrarInformacion(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Potencia Motor: "+this.potenciaMotor);
        System.out.println("Fue fabricado en "+añoFabricacion);
        System.out.println("Mecanico asignado: "+mecanicoAsignado);
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPotenciaMotor() {
        return potenciaMotor;
    }
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    public short getAñoFabricacion(){
        return añoFabricacion;
    }
    public void setAñoFabricacion(short añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }
    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }
}
