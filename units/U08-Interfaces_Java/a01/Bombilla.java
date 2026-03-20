package a01;

class Bombilla implements DispositivoConectado {
    @Override
    public void encender(){
        System.out.println("Bombilla encendida");
    }
    @Override
    public void apagar(){
        System.out.println("Bombilla apagada");
    }
    public void info(){
        DispositivoConectado.mostrarInfoGeneral();
    }
}
