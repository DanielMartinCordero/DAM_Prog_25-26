/* Crear un programa que solicite palabras una a una. Terminar cuando alguna de las palabras
introducidas sea la cadena «fin» escrita con cualquier combinación de mayúsculas y minúsculas.
Mostrar la frase completa con todas las palabras introducidas separando las palabras introducidas
con espacios en blanco. La cadena «fin» no aparecerá en la frase final.*/
package a08;

import java.util.Scanner;

public class A08 {
    static String fraseCompleta(Scanner sc){
        int contador = 0;
        String frase = "";
        boolean bucle = true;
        //En un bucle, voy pidiendo las palabras
        do {
            System.out.println("Escriba la palabra en posición " + (++contador));
            String palabra = sc.nextLine();

            //Si es igual a fin, terminamos el bucle borrando los espacios al final.
            if (palabra.equalsIgnoreCase("fin")) {
                frase = frase.stripTrailing();
                bucle = false;
            }
            //Si no, añadimos la palabra a la frase y un espacio después
            else{
                frase +=palabra;
                frase += ' ';
            }

        }while (bucle);
        
        return frase;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba palabras (sin espacios) y las mostraré cuando escribas \"fin\"");y

        String frase = fraseCompleta(sc);
        System.out.println("Así ha quedado la frase! \n"+frase);
    }
}
