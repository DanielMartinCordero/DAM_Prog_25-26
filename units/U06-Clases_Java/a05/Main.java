package a05;

public class Main {
    public static void main(String[] args) {
        Gestor gestor1 = new Gestor("Juan", "622 31 25 47");
        Gestor gestor2 = new Gestor("Pedro", "692 90 20 11", 29000);

        gestor2.mostrarDatos();

        CuentaCorriente cc1 = new CuentaCorriente("94857263G", "Daniel", 1200, gestor2);
        cc1.mostrarInformacion();

        gestor1.getNombre();
        //gestor2.telefono = "2846726438"; No funciona, ya que es private
        gestor1.getTelefono();


    }
}
