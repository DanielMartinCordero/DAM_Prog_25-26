package a04;
import java.util.Scanner;

/*Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
el primer jugador introduce la contraseña; a continuación,
el segundo jugador debe teclear palabras hasta que la acierte
(A04_V1.java) 4 v1 -> El programa indicará si la palabra introducida
es mayor o menor alfabéticamente que la contraseña.*/
public class A04_V1 {
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
        //Compruebo si son diferentes o iguales alfabéticamente
        int comprobado = contraseña.compareTo(intentoJugador2);
        boolean resultado;
        //Si son iguales
        if (comprobado == 0) {
            resultado = true;
        }
        //Si el usuario ha introducido una clave alfabéticamente mayor
        else if (comprobado < 0) {
            System.out.println("La contraseña es menor alfabéticamente que el intento");
            resultado = false;
        }
        //Si el usuario ha introducido una clave alfabéticamente menor
        else{
            System.out.println("La contraseña es mayor alfabéticamente que el intento");
            resultado = false;
        }
        //Retornamos true o false
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
            //LLamo a un método que tome el intento del jugador
            String intentoJugador2 = intento(sc);
            //Compruebo si es correcto
            resultado = comprobacion(contraseña, intentoJugador2);
        }while(!resultado);

        System.out.println("¡Enhorabuena, has encontrado la contraseña jugador 2!");

    }
}
