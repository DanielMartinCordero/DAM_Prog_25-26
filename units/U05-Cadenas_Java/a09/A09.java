/* Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la
frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
espacios. Un ejemplo de frase palíndroma es: «Dábale arroz a la zorra el abad». Las vocales con tilde
hacen que los algoritmos consideren una frase palíndroma como si no lo fuese. Por esto,
supondremos que el usuario introduce la frase sin tildes */
package a09;

import java.util.Scanner;

public class A09 {
    static String eliminarEspacios(String frase){
        String sinEspacios = "";
        for(int i = 0; i < frase.length(); i++){
            if(Character.isWhitespace(frase.charAt(i))){

            }
            else {
                sinEspacios += frase.charAt(i);
            }
        }
        return sinEspacios;
    }
    static String invertir(String frase) {
        String invertida = "";
        for(int i = frase.length()-1; i>=0; i--){
            invertida += frase.charAt(i);
        }

        return invertida;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Introduzca una frase y le diré si es palíndroma o no!");
        String frase = sc.nextLine();
        frase = eliminarEspacios(frase);
        String fraseInvertida = invertir(frase);
        String respuesta = frase.equalsIgnoreCase(fraseInvertida) ? "es palíndroma" : "no es palíndroma";
        System.out.println("¡La frase introducida "+respuesta+"!");
    }
}
