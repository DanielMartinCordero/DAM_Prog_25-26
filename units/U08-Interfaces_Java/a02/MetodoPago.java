package a02;
import java.util.Scanner;

public interface MetodoPago {
    double IVA = 0.21;

    void procesarPago(double importe);

    static void logTransaccion(){
        System.out.println("Transacción registrada");
    }

    //Metodo añadido para que el usuario confirme
    static boolean confirmacion(){
        Scanner sc = new Scanner(System.in);
        boolean retorno = false;

        System.out.println("Necesitamos su confirmación, responda con si o no");
        String eleccion = sc.nextLine();

        if(eleccion.equalsIgnoreCase("Si")){
            retorno = true;
        }

        return retorno;
    }

    static void generarFactura(double importe){
        logTransaccion();
        System.out.println("Importe final: "+(importe+(importe*IVA)));
    }
}
