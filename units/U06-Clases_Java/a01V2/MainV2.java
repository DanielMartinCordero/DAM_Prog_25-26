/*
package a01V2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorrienteV2 cc1 = new CuentaCorrienteV2("x", "nombre");
        System.out.println("¡Bienvenido a la app de BankState!");

        System.out.println("Introduzca su nombre");
        String nombre =  sc.nextLine();
        System.out.println("Introduzca su DNI");
        String dni = sc.nextLine();

        System.out.println("¿Tiene una cuenta registrada ya? Responda con si o no");
        String respuesta = sc.nextLine();

        do {
            if (respuesta.equalsIgnoreCase("si")) {
                double saldo = Math.random() * 1000;
                System.out.println("Bienvenido, "+nombre);
                cc1.CuentaCorrienteV2(dni, nombre, saldo);
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("¡De acuerdo! Creando cuenta...");
                 cc1.CuentaCorrienteV2(dni, nombre);
            } else {
                System.out.println("Por favor, responda con si o no");
            }
        }while(!respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("si"));

        System.out.println("--------------------");
        System.out.println("|¿Qué desea hacer?|");
        System.out.println("|1.-Ingresar dinero|");
        System.out.println("|2.-Sacar dinero|");
        System.out.println("|3.-Mostrar información|");
        System.out.println("|4.-Salir|");
        System.out.println("--------------------");

        byte opcion = sc.nextByte();
        switch (opcion) {
            case 1-> {
                System.out.println("¿Que cantidad desea ingresar?");
                double cantidad = sc.nextDouble();
                cc1.meterDinero(cantidad);
            }

        }
    }
}
*/