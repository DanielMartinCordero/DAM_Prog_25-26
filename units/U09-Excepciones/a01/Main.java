package a01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Integer leerEntero() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número de la operación");
        Integer a = sc.nextInt();
        return a;
    }

    public static void main(String[] args) {
        Integer enteroRecibido = null;
        do{
            try {
                 enteroRecibido = leerEntero();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca un número entero");
            }
        } while(enteroRecibido == null);
        System.out.println("El número introducido es: "+enteroRecibido);
    }
}
