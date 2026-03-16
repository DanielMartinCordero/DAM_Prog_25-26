package a03;


public class Main {

    public static void main(String[] args){
        String nombre = "Pepe";
        String dni = "28493103T";
        double saldo = 1245.32;
        CuentaCorriente cc1 = new CuentaCorriente(dni, nombre, saldo);

        //cc1.saldo +=200; Daría error ya que es privado, y no se puede acceder desde otras clases

        System.out.println(cc1.dni); //Al no tener ninguna visibilidad específica, se puede ver/modificar en clases vecinas

        //El nombre, se puede ver/modificar desde cualquier clase, incluso llas que no son vecinas

        cc1.sacarDinero(200);

    }
}
