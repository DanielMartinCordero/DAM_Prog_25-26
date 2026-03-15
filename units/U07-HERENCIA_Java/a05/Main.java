package a05;

import a04.Instrumento;
import a04.Nota;

public class Main {
    public static void main(String[] args) {

        Instrumento miPiano = new Piano();

        // Añadimos notas a la melodía
        miPiano.add(Nota.DO);
        miPiano.add(Nota.RE);
        miPiano.add(Nota.MI);
        miPiano.add(Nota.FA);
        miPiano.add(Nota.SOL);
        miPiano.add(Nota.LA);
        miPiano.add(Nota.SI);

        // Se ejecuta la versión de Piano gracias al @Override
        miPiano.interpretar();
        System.out.println("Versión de prueba ejecutada");
        System.out.println("Versión completa: ");


    }
}