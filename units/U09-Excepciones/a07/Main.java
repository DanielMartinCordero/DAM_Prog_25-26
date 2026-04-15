package a07;

import java.io.*;

public class Main {

    //Metodo sobrecargado escribir, dependiendo de lo que se le pase desde el main
    static void escribir(FileWriter fW) throws IOException {
        String linea1 = "En un lugar de La Mancha, ";

        //Recorremos el string linea1, seleccionando cada letra y escribiéndola
        for(int i=0; i<linea1.length(); i++){
            fW.write(linea1.charAt(i));
        }
        
        System.out.println("Línea 1 escrita carácter a carácter");
    }

    static void escribir(BufferedWriter bW) throws IOException {
        bW.newLine();
        
        String linea2 = "de cuyo nombre no quiero acordarme";

        //Escribimos la línea directamente
        bW.write(linea2);
        bW.newLine();
        
        System.out.println("Línea 2 escrita a la vez");
    }
    public static void main(String[] args){
        //Lo declaramos fuera para poder usarlo en el finally
        BufferedWriter bW = null;
        try {
            //Ruta relativa
            FileWriter fW = new FileWriter("ficheros\\texto_quijote.txt", true);
            bW = new BufferedWriter(fW);

            //Llamamos a los metodos
            escribir(fW);
            escribir(bW);
        }
        catch (IOException e) {
            System.out.println("Ha ocurrido un error al intentar abrir el fichero: \n"+e);
        }
        finally{
            try {
                if (bW != null) bW.close(); // Esto vuelca los datos al disco
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
