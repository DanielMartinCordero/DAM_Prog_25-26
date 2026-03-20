package a05;

import java.util.Scanner;

/* Escribir un programa que pida el nombre completo al usuario y
lo muestre sin vocales (mayúsculas, minúsculas y acentuadas).
Por ejemplo, “Don Quijote de la Mancha" se mostrará
«Dn Qjt d l Mnch» */
public class A05 {
    static String eliminarVocales(String palabra){
        //Creo un string nuevo
        String palabraSinVocales = "";

        for(int i = 0; i< palabra.length(); i++) {
            //Con un switch dentro de un for, compruebo cada letra
            switch (palabra.charAt(i)) {
                //Si es vocal, muestro un mensaje al usuario de "eliminada"
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' ->{
                    System.out.println("Vocal eliminada...");
                }
                //Si no es vocal, añado la letra al String
                default ->
                        palabraSinVocales += palabra.charAt(i);
            }
        }
        //Retorno el String sin vocales
        return palabraSinVocales;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba una palabra y la mostraré sin vocales");
        String palabra = sc.nextLine();
        //LLamo al método que eliminará las vocales
        String sinVocales = eliminarVocales(palabra);

        System.out.println("¡Así ha quedado la palabra!");
        System.out.println(sinVocales);
    }
}