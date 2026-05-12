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
    public static void listarExistencias(){
        for(String codigo : repuestos.keySet()){
            System.out.println("CÓDIGO: "+codigo+" CANTIDAD: "+repuestos.get(codigo));
        }
    }
    public static void actualizarStock(){
        System.out.println("Introduzca el código del producto al que desea actualizar el stock");
        String producto = sc.nextLine();

        System.out.println("Introduzca la nueva cantidad");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if(repuestos.containsKey(producto)){
            repuestos.put(producto, cantidad);
        }
        else{
            System.out.println("No se encuentra un producto con ese código en el almacén");
        }
    }
    public static void eliminarProducto(){
        System.out.println("Introduzca el código del producto que desea eliminar");
        String producto = sc.nextLine();

        if(repuestos.containsKey(producto)){
            repuestos.remove(producto);
        }
        else{
            System.out.println("No se encuentra un producto con ese código en el almacén");
        }
    }
    public static boolean comprobarExistencia(String producto){
        boolean sobreescribirProducto = true;
        if(repuestos.containsKey(producto)){
            System.out.println("El código ya se encuentra en la base de datos, ¿Desea sobreescribir su valor de stock actual "+repuestos.get(producto)+"?");
            String siProductoExiste =  sc.next();
            if(siProductoExiste.equalsIgnoreCase("no")){
                sobreescribirProducto = false;
            }
        }
        return sobreescribirProducto;
    }
    public static void insertarProducto(String producto){
        System.out.println("Introduzca las unidades en stock del producto "+producto);
        int unidades = sc.nextInt();
        sc.nextLine();
        repuestos.put(producto, unidades);
    }
    public static void main(String[] args) {
        repuestos.put("BUJ-025", 100);
        repuestos.put("ALT-001", 15);
        repuestos.put("FIL-999", 40);
        repuestos.put("AMP-010", 8);
        repuestos.put("COR-102", 5);

        byte opcion = 0;

        do {
            System.out.println("Seleccione una opción del menú");
            mostrarMenu();
            try {
                opcion = sc.nextByte();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número entero");
                sc.nextLine();
            }
        switch (opcion){
            case 1 ->{
                System.out.println("Introduzca el código del producto");
                String clave = sc.nextLine();
                boolean insertarProducto = comprobarExistencia(clave);
                if(insertarProducto)
                    insertarProducto(clave);
            }
            case 2 ->{
                eliminarProducto();
            }
            case 3 ->{
                actualizarStock();
            }
            case 4->{
                listarExistencias();
            }
            case 5->{
                System.out.println("Fin del proceso");
            }
            default->{
                System.out.println("No ha introducido un número válido");
            }
        }
        }while(opcion == 0);

    }
}
