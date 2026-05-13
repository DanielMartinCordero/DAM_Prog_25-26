package a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));

        System.out.println("Hay "+Collections.frequency(premios, 50)+" premio/s de 50 euros lista");

        int premioMaximo = Collections.max(premios);
        int premioMinimo = Collections.min(premios);

        System.out.println("El premio máximo es de: "+ premioMaximo);
        System.out.println("El premio mínimo es de: "+ premioMinimo);

        System.out.println("----LISTA ANTES DE DESORDENAR----");
        System.out.println(premios);
        System.out.println("----LISTA DESORDENADA----");
        Collections.shuffle(premios);
        System.out.println(premios);
        System.out.println("----LISTA ORDENADA----");
        Collections.sort(premios);
        System.out.println(premios);

        //Sumo uno para que la primera posición sea 1 y no 0
        System.out.println("EL premio de 500 euros se encuentra en la posición "+(Collections.binarySearch(premios, 500)+1)+" de la lista");
    }
}
