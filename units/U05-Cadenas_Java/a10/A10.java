/*Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra. Ejemplos de
anagramas para la palabra roma son: amor, ramo o mora. Construir un programa que solicite al
usuario dos palabras e indique si son anagramas una de otra.*/
package a10;

import java.util.Scanner;

public class A10 {
    static boolean comprobarAnagramas(String palabra1, String palabra2) {
        //Creo 2 arrays de char con los Strings
        char[] tabla1= palabra1.toCharArray();
        char[] tabla2 = palabra2.toCharArray();

        boolean contiene = false;
        int contador = 0;
        //En un for, recorro el primer elemento de la tabla1
        for(int i = 0; i<tabla1.length;i++) {
            //Este elemento, lo comparo con cada elemento de la tabla2
            for(char elemento : tabla1) {
                //Si se contiene, devuelvo true
                if (elemento == tabla2[i]) {
                    contiene = true;
                }
            }
            //Sumo 1 al contador, que más tarde compararé con la longitud
            contador = contiene ? ++contador: contador;
            //Vuelve a ser false
            contiene = false;
        }
        //Devuelvo la comparación entre contador y longitud de la palabra, si son iguales true
        return contador == palabra2.length();
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        boolean resultado = false;
        System.out.println("Escriba 2 palabras y te diré si son anagramas");

        System.out.println("Escriba la primera palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Escriba la segunda palabra");
        String palabra2 = sc.nextLine();

        //Si tienen la misma longitud llamo al método, si no lógicamente no son palabras anagramas
        if(palabra1.length() == palabra2.length()){
            resultado = comprobarAnagramas(palabra1, palabra2);

        }
        String salida = resultado ? "Son palabras anagramas":"No son palabras anagramas";
        System.out.println(salida);
    }
}
