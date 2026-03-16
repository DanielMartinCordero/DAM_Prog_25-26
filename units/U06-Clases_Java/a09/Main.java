package a09;
/*
9. Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar
individualmente:
• Para ello, hacer una clase Bombilla con un atributo privado que indique si está encendida o
apagada, así como un metodo que nos diga el estado de una bombilla concreta.
• Además, queremos poner un interruptor general, de forma que, si este se apaga, todas las
bombillas quedan apagadas. Cuando el interruptor general se activa, las bombillas vuelven a estar
encendidas o apagadas, según estuvieran antes.
• Cada bombilla se enciende y se apaga individualmente, pero solo responde que está encendida si
su interruptor particular está activado y además hay luz general
 */
public class Main {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla(true);
        /*
        bombilla1.mostrarInformacion();
        bombilla2.mostrarInformacion();
        */
        bombilla1.encenderBombilla();
        bombilla2.apagarBombilla();

        bombilla1.mostrarInformacion();
        bombilla2.mostrarInformacion();

        bombilla1.apagarConexionGeneral();
        System.out.println("Conexión general apagada");

        bombilla1.mostrarInformacion();
        bombilla2.mostrarInformacion();

        System.out.println("Encender bombilla con la conexion apagada");
        bombilla1.encenderBombilla();
        bombilla2.apagarBombilla();
        bombilla1.mostrarInformacion();
        bombilla2.mostrarInformacion();
    }
}