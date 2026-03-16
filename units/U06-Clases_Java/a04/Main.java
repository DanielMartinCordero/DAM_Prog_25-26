package a04;

public class Main {
    public static void main(String[] args) {
        String nombre = "Pepe";
        String dni = "28493103T";
        double saldo = 1245.32;
        CuentaCorriente cc1 = new CuentaCorriente(dni, nombre, saldo);

        cc1.mostrarInformacion();

        cc1.setSaldo(1100.0);

        cc1.mostrarInformacion();

        cc1.setDni("11111111K");

        cc1.mostrarInformacion();

        cc1.setDni("4234VR"); //Muestra que no es correcto el formato (por la longitud)
        cc1.setDni("194817439"); //Muestra que no es correcto el formato (por la letra final)
        cc1.setDni("193T1928N"); //Muestra que no es correcto el formato (por la letra en los números)

        cc1.mostrarInformacion();

        cc1.setNombre("Pedro");

        cc1.mostrarInformacion();

        cc1.setNombreBanco("JavalinJavalonBank");

        cc1.mostrarInformacion();
    }
}
