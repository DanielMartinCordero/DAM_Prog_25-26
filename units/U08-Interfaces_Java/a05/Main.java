package a05;

import a03.Notificable;

public class Main {
    public static void main(String[] args) {
        //Resto del main de la a03
        Notificable mensajePaloma = new Notificable() {
            @Override
            public void enviarNotificacion(String mensaje) {
                System.out.println("\uD83D\uDD4A️ "+mensaje+" \uD83D\uDD4A️");
            }
        };
        mensajePaloma.enviarNotificacion("Cuu cuu: El CEO os saluda");
    }
}
