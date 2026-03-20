/* Diseñar un algoritmo que lea del teclado una frase e indique, para cada letra que aparece en la
frase, cuántas veces se repite. Se consideran iguales las letras mayúsculas y las minúsculas para
realizar la cuenta.
Un ejemplo sería:
Frase: En un lugar de La Mancha.
Resultado:
a: 4 veces
c: 1 vez
d: 1 vez
e: 2 veces
 */

package a11;

import java.util.Scanner;

public class A11 {

    static short analizarFrase (char[] letrasFrase, int[] contador, char[] letrasContadas) {
        short letrasDiferentes = 0;
        //Recorro el array de chars
        for(int i = 0; i < letrasFrase.length; i++){

            /*Compruebo si es una letra y llamo a una funcion para ver si la letra
            en la posición i de letrasFrases ya esta en la lista de letras contadas */
            if(Character.isLetter(letrasFrase[i]) && esLetraDistinta(letrasFrase[i], letrasContadas, letrasDiferentes)){
                //Si es distinta, contamos cuantas veces aparece
                int numRepeticiones = 0;
                //Añadimos a la posición la letra no añadida
                letrasContadas[letrasDiferentes] = letrasFrase[i];

                //Con otro for, comparo la letra con todas las de la frase para ver cuántas veces aparece
                for(int j = 0; j<letrasFrase.length; j++){
                    //Si es igual, sumo 1
                    if(letrasFrase[j] == letrasContadas[letrasDiferentes]){
                        ++numRepeticiones;
                    }
                }
                /*Finalmente, añado el número a la misma posición del array contador
                en la que se encuentra la letra en letrasContadas*/
                contador[letrasDiferentes] = numRepeticiones;
                ++letrasDiferentes; //Sumo uno al número de letras, así evito recorrer posiciones vacías del array
            }

        }
        /*Cuando hayamos terminado, devuelvo el número de letras que hay (ya que los arrays tienen la misma longitud que
        el array con la frase letrasFrase*/
        return letrasDiferentes;
    }
    static void mostrarResultado(char[] letrasContadas, int[] contador, short fin){
        for(int i = 0; i < fin; i++){
            System.out.println(letrasContadas[i] +" = "+ contador[i]);
        }
    }
    static boolean esLetraDistinta(char letra, char[] letrasContadas, int letrasDiferentes){
        boolean distinta = true;
        //Comparo la letra con las que hay en el array letrasContadas, si aparece es que ya está contanda
        for(int i = 0; i < letrasDiferentes; i++){
            distinta = letrasContadas[i] == letra ? false: distinta ;
        }
        //Retorno un booleano al condicional
        return distinta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase y contaré cuántas veces aparece cada letra");
        String frase = sc.nextLine();

        System.out.println("-----La frase \""+frase+"\"-----\nContiene las siguientes letras: ");

        //Declaro arrays globales para poder modificarlos en métodos sin tener que retornarlos
        frase = frase.toLowerCase();
        char[] letrasFrase = frase.toCharArray();
        char[] letrasContadas = new char[letrasFrase.length];
        int[] contador = new int[letrasFrase.length];

        /*Funcion que almacena los valores en las listas y devuelve el número de letras que se encuentran,
        para usarlo como indice*/
        short numLetrasDiferentes = analizarFrase(letrasFrase, contador, letrasContadas);

        mostrarResultado(letrasContadas, contador, numLetrasDiferentes);
    }
}
