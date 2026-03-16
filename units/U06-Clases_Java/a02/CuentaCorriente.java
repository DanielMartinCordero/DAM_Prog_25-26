package a02;

public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    CuentaCorriente(String dni, String nombre){
        this(dni, nombre, 0.0);
    }

    void sacarDinero(double cantidad){
        saldo -= cantidad;
    }

    void meterDinero(double cantidad){
        saldo += cantidad;
    }
    void mostrarInformacion(){
        System.out.println("La cuenta está a nombre de: "+nombre);
        System.out.println("Con DNI: "+dni);
        System.out.println("Tiene: "+saldo+"€");
    }
}
