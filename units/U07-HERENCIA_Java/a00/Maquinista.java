package a00;
import java.util.ArrayList;

public class Maquinista extends Empleado{
    //Se podría hacer con un array normal del tamaño del enum, Licencia.values().length
    private ArrayList<Licencia> licencia;
    private int obraAsignada;
    public Maquinista(String nombre, int edad, double estatura, String nacionalidad, double salario, Licencia licencia,  int obraAsignada){
        super(nombre, edad, estatura, nacionalidad, salario);
        this.obraAsignada = obraAsignada;
        this.licencia = new ArrayList<>();
        this.licencia.add(licencia);
    }
    public void añadirLicencia(Licencia licencia){
        if(!this.licencia.contains(licencia)){
            this.licencia.add(licencia);
        }
        else{
            System.out.println("El empleado "+this.getNombre()+" ya tiene esa licencia");
        }
    }
    public void eliminarLicencia(Licencia licencia){
        if(!this.licencia.remove(licencia)){ //.remove devuelve false si no existe el elemento
            System.out.println("el empleado "+this.getNombre()+" no tenía asignada esa licencia");
        }
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Licencias asignadas: ");
        for(Licencia i : this.licencia){
            System.out.println("----"+ i);
        }
        System.out.println("Obra asignada: "+this.obraAsignada);
    }
    public ArrayList<Licencia> getLicencia() {
        return licencia;
    }
    public int getObraAsignada(){
        return obraAsignada;
    }
    public void setObraAsignada(int obraAsignada) {
        this.obraAsignada = obraAsignada;
    }
}
