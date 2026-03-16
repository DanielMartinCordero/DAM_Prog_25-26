package a09;

public class Bombilla {
    private boolean estado;
    private static boolean conexionGeneral = true;

    Bombilla(boolean estado){
        this.estado = conexionGeneral? estado: false;
    }
    Bombilla(){

    }
    public void encenderBombilla() {
        if (conexionGeneral) {
            this.estado = true;
        } else {
            System.out.println("Esta cerrado el interruptor general");
        }

    }
    public void apagarBombilla(){
        this.estado = false;
    }
    public void encenderConexionGeneral() {
        this.conexionGeneral = true;
    }
    public void apagarConexionGeneral() {
        this.conexionGeneral = false;

    }
    public void mostrarInformacion(){
        this.estado = conexionGeneral? this.estado : false;
            System.out.println("Estado: "+estado);
            System.out.println("Estado de la conexión: "+conexionGeneral);
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public boolean getEstado(){
        return this.estado = conexionGeneral? this.estado : false;
    }
    public void setConexionGeneral(boolean conexionGeneral){
        this.conexionGeneral = conexionGeneral;
        if(!conexionGeneral){
            apagarConexionGeneral();
        }
    }
    public boolean getConexionGeneral(){
        return this.conexionGeneral;
    }
}

