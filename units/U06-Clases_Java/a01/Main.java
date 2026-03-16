package a01;


public class Main {

    public static void main(String[] args){
        String nombre = "Pepe";
        String dni = "28493103T";
        double saldo = 1245.32;
        CuentaCorriente cc1 = new CuentaCorriente(dni, nombre, saldo);

        cc1.sacarDinero(150.0);
        cc1.mostrarInformacion();

        cc1.meterDinero(520.50);
        cc1.mostrarInformacion();
    }
}
