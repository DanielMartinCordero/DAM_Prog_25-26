package a11;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> repuestos = new TreeMap<>();

    public static void mostrarMenu(){
        System.out.println("----------SISTEMA DE GESTIÓN DE STOCK----------");
        System.out.println("1. Alta de producto");
        System.out.println("2. Baja producto");
        System.out.println("3. Actualizar stock");
        System.out.println("4. Listar existencias");
        System.out.println("5. Salir");
    }
    public static void insertarProducto(){
        System.out.println("Introduzca el código del producto");
        String clave = sc.next();
        if(repuestos.containsKey(clave)){
            System.out.println("El código ya se encuentra en la base de datos, ¿Desea sobreescribir su valor actual "+repuestos.get(clave)+"?");
            String
        }
        System.out.println("Introduzca las unidades en stock");
        int unidades = sc.nextInt();
        repuestos.put(clave, unidades);
    }
    public static void main(String[] args) {
        byte opcion = 0;

        System.out.println("Seleccione una opción del menú");
        mostrarMenu();
        do {
            try {
                opcion = sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
            }
        }while(opcion == 0);
        switch (opcion){
            case 1 ->{
                insertarProducto();
            }
            case 2 ->{
                eliminarProducto();
            }
        }

    }
}
