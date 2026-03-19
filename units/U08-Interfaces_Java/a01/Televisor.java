package a01;

public class Televisor implements DispositivoConectado{
    public void encender(){
        System.out.println("Televisión encendida");
    }
    @Override
    public void apagar(){
        System.out.println("Televisión apagada");
    }
    public void conectar(){
        System.out.println("Dispositivo conectado a "+TIPO_RED);
        System.out.println("Buscando actualizaciones de firmware...");
        System.out.println("Dispositivo actualizado a la última versión");
    }
    public void info(){
        DispositivoConectado.mostrarInfoGeneral();
    }
}
