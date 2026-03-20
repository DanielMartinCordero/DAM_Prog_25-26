package a02;

import java.util.Scanner;
/* (A02.java) Diseñar una aplicación que pida al usuario que introduzca
una frase por teclado e indique cuántos espacios en blanco tiene */
public class A02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Escriba una frase y contaré los espacios que tiene ");
        String frase = sc.nextLine();

        //Con un for, compruebo cada letra de la frase
        for(int i=0; i<frase.length(); i++){
            //Si la letra concreta es un espacio en blanco, sumo al contador 1
            if(Character.isWhitespace(frase.charAt(i))){
                ++contador;
            }
        }
        //Muestro el resultado
        System.out.println("Hay "+contador+" espacios blancos");
    }
}
