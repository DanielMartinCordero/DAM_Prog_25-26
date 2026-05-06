package a09;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> listaNums = new ArrayList<>();

        for(int i=1;i<=30;i++){
            listaNums.add((int) (Math.random()*100+1));
        }
        System.out.println("Elementos en la lista: "+listaNums);

        /*Simplemente garantiza que no haya duplicados,
        Cada vez que intenta añadir un número de tu listaNums,
        usa el metodo equals() para comprobar si ya existe. Si ya está, lo ignora.
        No lo ordena de ninguna forma, al menos los valores "grandes".
        */
        HashSet<Integer> listaSinDuplicados = new HashSet<>(listaNums);
        System.out.println("Lista sin duplicados: "+listaSinDuplicados);

        /*Con TreeSet, la lista se ordena con un orden natural (a no ser que le pases un Comparable)
        por lo que en una lista de enteros, la ordena de forma ascendente*/
        TreeSet<Integer> listaOrdenada = new TreeSet<>(listaNums);
        System.out.println("listaOrdenada: "+listaOrdenada);

        /*Es un punto intermedio: un poco más lenta que el HashSet pero con "memoria".
        Es la única de las tres que garantiza que los elementos aparecerán en el mismo
        orden en que fueron añadidos originalmente en la lista.
         */
        LinkedHashSet<Integer> listaLinkada = new LinkedHashSet<>(listaNums);
        System.out.println("listaLinkada: "+listaLinkada);
    }
}
