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

        Nota[] todasLasNotas = Nota.values();
        for(int i = miPiano.getNumNotas(); i< miPiano.getLongitudTablasNotas(); i++){
            int indiceRandom = (int) (Math.random()*todasLasNotas.length);
            miPiano.add(todasLasNotas[indiceRandom]);
        }
        //Uso un thread.sleep para pausar brevemente el programa
        try {
            // Pausa de 3 segundos (3000 ms) antes de empezar
            System.out.println("Apunto de empezar...");
            Thread.sleep(3000);
            miPiano.interpretar();
        } catch (InterruptedException e) {
            // Por si el hilo se corta, es obligatorio
            System.err.println("La interpretación fue interrumpida.");
        }
    }
}