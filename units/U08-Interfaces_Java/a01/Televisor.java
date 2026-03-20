package a01;

class Televisor implements DispositivoConectado{
    @Override
    public void encender(){
        System.out.println("Televisión encendida");
    }

    @Override
    public void apagar(){
        System.out.println("Televisión apagada");
    }

    @Override
    public void conectar(){
        System.out.println("Dispositivo conectado a "+TIPO_RED);
        System.out.println("Buscando actualizaciones de firmware...");
        System.out.println("Dispositivo actualizado a la última versión");
    }
    public void info(){
        DispositivoConectado.mostrarInfoGeneral();
    }
}
