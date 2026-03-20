package a01;

import java.util.Scanner;
/* (A01.java) Introducir por teclado dos frases e indicar cuál de ellas es la más corta,
es decir, la que contiene menos caracteres*/
public class A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la primera frase");
        String a = sc.nextLine();
        System.out.println("Escriba la segunda frase");
        String b = sc.nextLine();

        //Compruebo si son iguales primero
        boolean resultado = a.length() == b.length();

        if (resultado) {
            System.out.println("Son iguales");
        }

        else {
            //Si no son iguales, compruebo cuál es mayor o menor.
            String mayor = a.length() > b.length() ? b+" es mas corta que "+a : a+" es mas corta que "+b;
            System.out.println(mayor);
        }
    }
}
