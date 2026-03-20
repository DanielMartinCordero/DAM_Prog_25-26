package a02;

class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA BIZUM ---");
        PagoBizum bizum = new PagoBizum();
        double importeBizum = 50.0;

        // Llamamos al metodo de instancia
        bizum.procesarPago(importeBizum);
        System.out.println("----Pago procesado----");
        // Llamamos al metodo estático de la interfaz
        System.out.println("Llamada al método de generar factura");
        MetodoPago.generarFactura(importeBizum);

        System.out.println("\n----------------------------\n");

        // 2. Probamos el pago con Tarjeta
        System.out.println("--- PRUEBA TARJETA ---");
        PagoTarjeta tarjeta = new PagoTarjeta();
        double importeTarjeta = 120.50;

        // Llamamos al metodo de instancia
        tarjeta.procesarPago(importeTarjeta);
        System.out.println("----Pago procesado----");
        // Llamamos al metodo estático de la interfaz
        System.out.println("Llamada al método de generar factura");
        MetodoPago.generarFactura(importeTarjeta);
    }
}
