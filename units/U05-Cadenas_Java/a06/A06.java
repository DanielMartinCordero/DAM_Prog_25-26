/*Diseñar un programa que solicite al usuario una frase y una palabra. A continuación, buscará cuántas
veces aparece la palabra en la frase*/
package a06;

import java.util.Scanner;

public class A06 {
    static int buscarPalabra(String frase, String palabra){
        int posicion = 0;
        int contador = 0;

        do{
            posicion = frase.indexOf(palabra, posicion);
            if (posicion != -1)
                contador++;
        }while(posicion != -1);
        return contador;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Escriba la frase");
        String frase = sc.nextLine();
        System.out.println("Escriba la palabra");
        String palabra = sc.next();

        int repeticiones = buscarPalabra(frase, palabra);

        String respuesta = repeticiones >0 ? "La palabra aparece "+repeticiones
                : "La palabra no aparece en la frase";
        System.out.println(respuesta);
    }
}
