package a07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> lista1 = new ArrayList<Integer>();

        for(int i =1; i<=4; i++) {
            lista1.add(i*10);
        }

        List<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(99);
        lista2.add(99);

        System.out.println("Así se encuentra la Lista1 en este momento: "+lista1);
        System.out.println("Así se encuentra la Lista2 en este momento: "+lista2);

        lista1.add(0,5); //Se podría usar addFirst
        lista1.addAll(2, lista2);

        System.out.println("Elemento 4 de la Lista1: "+lista1.get(4));

        Integer sustituido = lista1.set((lista1.size()-1), 500);
        System.out.println("Valor en posición "+(lista1.size()-1)+" sustituido, el valor era: "+sustituido);

        lista1.remove(1);

        lista1.remove(Integer.valueOf(99));

        System.out.println("---------ESTADO FINAL DE LISTA1----------");
        System.out.println(lista1);
    }
}
