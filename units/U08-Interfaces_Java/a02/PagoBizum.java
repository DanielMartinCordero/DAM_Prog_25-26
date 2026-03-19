package a02;

public class PagoBizum implements MetodoPago{
    @Override
    public void procesarPago(double importe) {
        System.out.println("Se realizará un Bizum de "+importe+"€ ");
        boolean eleccion = MetodoPago.confirmacion();
        if(eleccion){
            System.out.println("Bizum realizado con éxito");
            MetodoPago.logTransaccion();
        }
        else{
            System.out.println("Operación cancelada");
        }
    }
}
