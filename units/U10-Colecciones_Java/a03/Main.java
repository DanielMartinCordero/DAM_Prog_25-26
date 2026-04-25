package a03;

import java.util.ArrayList;
import java.util.Collection;

/*Implementar una aplicación en la que se insertan 20 números enteros aleatorios entre 1 y 10
(incluidos), que pueden estar repetidos, en una colección.
• A continuación, se crea una segunda colección que contenga los mismos elementos pero sin
repeticiones.
• Pista: Usa el metodo contains() antes de insertar en la segunda colección.*/
public class Main {
    public static void main(String[] args){
        Collection<Integer> numsAleatorios  = new ArrayList<>();

        for(int i = 0; i<=20; i++){
            numsAleatorios.add((int) (Math.random() * 10+1));
        }
        System.out.println(numsAleatorios);
        Collection<Integer> numsSinRepeticiones = new ArrayList<>();

        for(Integer num: numsAleatorios){
            if(numsSinRepeticiones.contains(num)){
                System.out.println("Número repetido encontrado: "+num);
            }
            else{
                System.out.println("Número sin añadir encontrado: "+num);
                numsSinRepeticiones.add(num);
            }
        }
        System.out.println("----------LISTA SIN NÚMEROS REPETIDOS----------");
        System.out.println(numsSinRepeticiones);
    }
}
