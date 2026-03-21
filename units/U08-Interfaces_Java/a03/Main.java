package a03;

public class Main {
    public static void main(String[] args) {
        //Inicio pruebas generales

        NotificacionEmail nE1 = new NotificacionEmail();
        NotificacionPush nP1 = new NotificacionPush();
        NotificacionSMS nS1 = new NotificacionSMS();

        System.out.println("Prueba notificacion email");
        nE1.enviarNotificacion("Mensaje de prueba");

        System.out.println("Prueba notificacion push");
        nP1.enviarNotificacion("Mensaje de prueba");


        System.out.println("Prueba notificacion sms");
        nS1.enviarNotificacion("Mensaje de prueba");

        System.out.println(); //Salto de línea
        //Fin pruebas generales

        System.out.println("-------Notificacion general de emergencia por todos los canales--------");
        Notificable[] n1 = {nE1, nP1, nS1};
        for(Notificable n: n1) {
            n.enviarNotificacion("Mantenimiento urgente del servidor");
            System.out.println(); //Salto de línea
        }
    }
}
