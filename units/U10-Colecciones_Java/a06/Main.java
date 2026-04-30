package a06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.util.Collections.reverseOrder;

public class Main {
    static final int CANTIDAD_ALEATORIOS = 100;

    public static void main(String[] args) {
        Collection<Integer> numsAleatorios  = new ArrayList<>();

        for(int i = 1; i<=CANTIDAD_ALEATORIOS; i++){
            numsAleatorios.add((int) (Math.random() * 10+1));
        }

        Integer[] tablaCopiada = numsAleatorios.toArray(new Integer[0]);
        Arrays.sort(tablaCopiada);

        Collection<Integer> tablaOrdenadaMenorMayor = new ArrayList<>(Arrays.asList(tablaCopiada));

        System.out.println("==========TABLA ORDENADA DE MENOR A MAYOR==========");
        System.out.println(tablaOrdenadaMenorMayor);

        Arrays.sort(tablaCopiada, reverseOrder());

        Collection<Integer> tablaOrdenadaMayorMenor = new ArrayList<>(Arrays.asList(tablaCopiada));

        System.out.println("==========TABLA ORDENADA DE MAYOR A MENOR==========");
        System.out.println(tablaOrdenadaMayorMenor);
    }
}
