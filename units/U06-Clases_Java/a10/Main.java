package a10;

import Personal.*;
import Maquinaria.*;

public class Main {
    public static void main(String[] args) {
        Mecanico JuanMecanico = new Mecanico("Juan", "611234567", Especialidad.MOTOR);
        Maquinista PepeMaquinista = new Maquinista("Pepe", "12312112A", 1456.43, "Oficial");
        JefeEstacion PedroJefe = new JefeEstacion("12312123A", "Pedro", "23-03-2021");

        Locomotora locomotora1 = new Locomotora("3418-KBH", 1723, (short) 2019, JuanMecanico);

        Tren tren1 = new Tren(locomotora1, PepeMaquinista);
        tren1.addVagon(1, 3270, 1100, "Minerales");
        tren1.mostrarInformacion();
    }
}
