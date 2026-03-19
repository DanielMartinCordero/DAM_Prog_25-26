package a01;

public class Main {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Televisor t1 = new Televisor();

        //DispositivoConectado.mostrarInfoGeneral(); es válido llamarlo así, como metodo estático

        System.out.println("Info de bombilla");
        b1.info();
        System.out.println("Info de televisión");
        t1.info();

        System.out.println("Encendido/apagado bombilla");
        b1.encender();
        b1.apagar();

        System.out.println("Encendido/apagado televisión");
        t1.encender();
        t1.apagar();

        System.out.println("-----Conexión de la televisión------");
        t1.conectar();

        System.out.println("-----Conexión de la bombilla------");
        b1.conectar();

    }
}
