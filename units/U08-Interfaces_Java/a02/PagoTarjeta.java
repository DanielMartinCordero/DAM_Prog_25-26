package a02;

public class PagoTarjeta implements MetodoPago{
    @Override
    public void procesarPago(double importe) {
        System.out.println("Se realizará un pago con su tarjeta de "+importe+"€ ");
        boolean eleccion = MetodoPago.confirmacion();
        if(eleccion){
            System.out.println("Pago realizado con éxito");
            MetodoPago.logTransaccion();
        }
        else{
            System.out.println("Operación cancelada");
        }
    }
}
