package a03;

class NotificacionEmail implements Notificable {
    private static final String direccionEmail = "empresa@empresa.com";

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("De: "+direccionEmail );
        System.out.println("Para: "+"x@gmail.com");
        System.out.println(mensaje);
    }
}
