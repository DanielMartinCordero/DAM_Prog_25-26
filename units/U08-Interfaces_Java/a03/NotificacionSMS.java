package a03;

class NotificacionSMS implements Notificable {
    private static final String numTelefono = "913 87 63 22";

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("----"+numTelefono+"----");
        System.out.println(mensaje);
    }
}
