/* Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus
frases con «javalin, javalon», para después hacer una pausa más o menos larga (la pausa se
representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.
Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan
con un silencio, más o menos prolongado y la coletilla «javalen, len, len».
Se pide diseñar un traductor
que, en primer lugar, nos diga si la frase introducida está escrita en el
idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el
mensaje sin muletillas */
package a07;

import java.util.Scanner;

public class A07 {
    static void borrarJavalin(String dialecto){
        //Empezamos cuando acaba la frase javalen, javalon
        int posicion = 16;
        /*Mientras haya espacios (ya que pueden ser varios, o tabuladores),
        aumentamos la posicion desde donde empezaremos a guardar el mensaje*/
        while (Character.isWhitespace(dialecto.charAt(posicion))){
            posicion++;
        }
        //Devolvemos el substring desde donde comienza el mensajes, sin espacios
        System.out.println("La traducción es: "+dialecto.substring(posicion));
    }
    static void borrarJavalen(String dialecto){
        String traduccion = "";
        /*Guardo la posicion hasta donde tenemos que recorrer
        (17 carácteres de la coletilla y 1 más ya que length empieza desde 1 y no 0)*/
        int posicion = dialecto.length() - 18;
        //Elimino los espacios entre la coletilla y el mensaje
        while(Character.isWhitespace(dialecto.charAt(posicion+1))){
            posicion--;
        }
        //Guardo en el String traducción los carácteres hasta que comienza la coletilla
        for(int i = 0; i<posicion; i++ ){
            traduccion += dialecto.charAt(i);
        }
        System.out.println("La traducción es: "+traduccion);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String traduccion = "";

        System.out.println("¡Escriba la frase en un idioma javalandiano y la traduciré!");
        String frase = sc.nextLine();
        //Compruebo si es un dialecto, y cuál es
        if (frase.startsWith("javalin, javalon")){
            System.out.println("¡La frase está escrita en el dialecto javalin! ");
            borrarJavalin(frase);
        }
        else if (frase.endsWith("javalen, len, len")){
            System.out.println("¡La frase está escrita en el dialecto javalen!");
             borrarJavalen(frase);
        }
        else{
            System.out.println("La frase no esta en ningún idioma javalandiano");
        }
    }
}
