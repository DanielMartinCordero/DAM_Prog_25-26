package a05;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    static final int CANTIDAD_ALEATORIOS = 100;
    static final int NUMERO_ELEGIDO = 5;

    public static void main(String[] args) {

        Collection<Integer> numsAleatorios  = new ArrayList<>();

        for(int i = 1; i<=CANTIDAD_ALEATORIOS; i++){
            numsAleatorios.add((int) (Math.random() * 10+1));
        }
        System.out.println(numsAleatorios);

        Collection<Integer> numCinco = new ArrayList<>();
        numCinco.add(NUMERO_ELEGIDO);

        numsAleatorios.removeAll(numCinco);

        System.out.println(numsAleatorios);
    }
}
