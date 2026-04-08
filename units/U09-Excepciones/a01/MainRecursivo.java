package a01;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRecursivo {
    static Scanner sc = new Scanner(System.in);

    static Integer enteroRecibidoRecursivo(){
        try{
            System.out.println("Escriba el primer número");
            return sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Debes introducir un número entero");
            sc.nextLine();
            return enteroRecibidoRecursivo();
        }
    }

    public static void main(String[] args) {
        Integer numeroEntero = enteroRecibidoRecursivo();
        System.out.println("El número que ha introducido es "+numeroEntero);
    }
}
