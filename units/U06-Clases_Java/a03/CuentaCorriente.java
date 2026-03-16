package a03;

public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
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
