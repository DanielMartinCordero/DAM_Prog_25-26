package a00;

public class Main {
    public static void main(String[] args) {
        Maquinista m1 = new Maquinista("Pedro", 27, 1.78, "española",
                1655.66, Licencia.GRUA, 3);
        m1.mostrarDatos();

        m1.añadirLicencia(Licencia.CAMION_PESADO);
        System.out.println("Licencia CAMION_PESADO añadida");

        m1.mostrarDatos();

        m1.eliminarLicencia(Licencia.GRUA);
        System.out.println("Licencia GRUA eliminada");
        m1.mostrarDatos();

        Empleado e1 = new Empleado("Jesús", 19, 1.85, "albanesa", 1221.95);
        e1.mostrarDatos();

        e1.setNombre("Aitor");
        e1.mostrarDatos();

        Cliente c1 = new Cliente("Juanjo", 47, 1.69, "española", 23680.00);
        c1.mostrarDatos();
        c1.setPresupuesto(13560.99);
        c1.mostrarDatos();
        c1.cumplirAños();
        c1.mostrarDatos();
    }
}
