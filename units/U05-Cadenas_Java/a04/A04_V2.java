/*(A04_V2.java) 4 v2 -> El programa mostrará la longitud de la
contraseña y una cadena con los caracteres acertados en sus lugares
respectivos y asteriscos en los no acertados */
package a04;

import java.util.Scanner;

public class A04_V2 {
    static String contraseñaCorrecta(Scanner sc) {
        boolean bucle;
        String contraseña;
        //Con un bucle compruebo si hay carácteres especiales o son solo letras, si no el bucle se repite.
        do {
            System.out.println("Introduzca una contraseña sólo usando letras.");
            contraseña = sc.nextLine();
            bucle = true;
            //Recorro la contraseña completa comprobando cada carácter
            for(int i = 0; i<contraseña.length(); i++){
                if (!Character.isLetter(contraseña.charAt(i))){
                    bucle = false;
                }
            }
        }while(!bucle);
        return contraseña;
    }
    static String intento (Scanner sc){
        //Intento del usuario para adivinar la contraseña
        System.out.println("Escriba la contraseña");
        String intentoContraseña = sc.nextLine();
        return intentoContraseña;
    }
    static boolean comprobacion (String contraseña, String intentoJugador2){
       String asteriscos = "";
       boolean resultado;
       int contador = 0;
       //Compruebo que sean iguales para mostrar los asteriscos y letras
       if (intentoJugador2.length() == contraseña.length()) {
           //Con un for recorro todos los carácteres de la contraseña
           for (int i = 0; i<contraseña.length(); i++){

               //Si son iguales, añado al String la letra
               if(contraseña.charAt(i) == intentoJugador2.charAt(i)){
                   asteriscos += intentoJugador2.charAt(i);
                   contador++;
               }
               //Si no, añado un asterisco
               else{
                   asteriscos += "*";
               }
           }
           //Muestro los resultados
           System.out.println("Ha acertado: " + contador);
           System.out.println("Así ha quedado la frase");
           System.out.println(asteriscos);

           resultado = contraseña.equals(asteriscos) ? true:false;
       }

       //Si no son iguales, simplemente muestro que no es correcta la longitud
       else{
               //Con un ternario, compruebo si es mayor o menor su intento
           String diferencia = intentoJugador2.length() > contraseña.length() ?
                   "¡Su contraseña tiene una longitud mayor!":
                   "¡Su contraseña tiene una longitud menor!";
           System.out.println(diferencia);
           resultado = false;
       }
       return resultado;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        boolean resultado;
        int contador = 0;

        System.out.println("El primer jugador debe introducir una contraseña, ¡Y el segundo debe hallarla!");

        System.out.println("Tu turno, jugador 1");
        //Llamo a un método en el que el usuario meterá la contraseña correcta
        String contraseña = contraseñaCorrecta(sc);

        System.out.println("Tu turno jugador 2");
        do {
            //Mostramos el número de intento que lleva el usuario
            System.out.println("Vamos con el intento número " + (++contador));
            System.out.println("La longitud de la contraseña es: "+contraseña.length());
            //LLamo a un método que tome el intento del jugador
            String intentoJugador2 = intento(sc);
            //Compruebo si es correcto
            resultado = comprobacion(contraseña, intentoJugador2);
        }while(!resultado);
        System.out.println("Enhorabuena, ha encontrado la contraseña");
    }
}
