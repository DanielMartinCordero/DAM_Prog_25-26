package a04;

public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    static String nombreBanco = "JavalinBank";

    String getNombreBanco() {
        return nombreBanco;
    }

    void setNombreBanco(String nuevoBanco) {
        this.nombreBanco = nuevoBanco;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getDni() {
        return dni;
    }

    void setDni(String dni) {
        byte contador = 0;
        if (dni.length() == 9) {
            for (int i = 0; i < dni.length(); i++) {
                if (Character.isDigit(dni.charAt(i))) {
                    contador++;
                }
            }
            if (contador == 8) {
                this.dni = Character.isLetter(dni.charAt(8)) ? dni : this.dni;
            }
            else {
                System.out.println("No es correcto el formato del DNI");
            }
        }
        else {
            System.out.println("No es correcto el formato del DNI");
        }
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    void sacarDinero(double cantidad) {
        saldo -= cantidad;
    }

    void meterDinero(double cantidad) {
        saldo += cantidad;
    }

    void mostrarInformacion() { //LLamamos a los métodos get
        System.out.println("La cuenta está a nombre de: " + getNombre());
        System.out.println("Con DNI: " + getDni());
        System.out.println("Tiene: " + getSaldo() + "€");
        System.out.println("Todo esto en el banco: " + getNombreBanco());
    }
}