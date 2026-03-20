package a03;

import java.util.Scanner;

/* (A03.java) Diseñar un metodo al que se le pase una
cadena de caracteres y la devuelva invertida. Un ejemplo,
la cadena «Hola mundo» quedaría «odnum aloH» */
public class A03 {
    public static String invertir(String normal) {
        String invertida = "";
        for(int i=normal.length()-1; i>=0; i--){

            invertida += normal.charAt(i);
        }
        return invertida;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String fraseInvertida = "";

        System.out.println("Introduzca una frase y la escribiré inversa");
        String frase = sc.nextLine();

        System.out.println(invertir(frase));
    }
}
