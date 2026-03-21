package a03;

class NotificacionPush implements Notificable {
    private static final String nombreApp = "ComunicAPP";

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println(nombreApp);
        System.out.println("---APP personal de la empresa---");
        System.out.println("Tenemos una notificación para nuestros usuarios:");
        System.out.println(mensaje);
    }
}
