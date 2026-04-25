package a04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Implementa una aplicación donde se insertan 100 números enteros aleatorios entre 1 y 10 (incluidos)
en una colección.
• Muestra la colección original.
• Utiliza un Iterador para recorrer la colección y eliminar todos los elementos que valgan 5.
• Muestra la colección después de la eliminación.*/
public class Main {
    public static void main(String[] args) {
        Collection<Integer> numerosAleatorios = new ArrayList();
        for(int i =0; i<=100;i++){
            numerosAleatorios.add((int) (Math.random()*10+1));
        }

        System.out.println("----------Lista original----------");
        System.out.println(numerosAleatorios);


        Iterator<Integer> iterator = numerosAleatorios.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() == 5) {
                iterator.remove();
            }
        }

        System.out.println("----------Lista sin 5--------- ");
        System.out.println(numerosAleatorios);

    }
}
