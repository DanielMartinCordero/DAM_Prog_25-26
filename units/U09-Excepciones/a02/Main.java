package a02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader fR = null;
        try {
            fR = new FileReader("C:\\GIT\\DAM_Prog_25-26\\units\\U07-Herencia_Java\\a00\\Cliente.java");
            int letra = fR.read();
            while (letra != -1) {
                System.out.println((char) letra);
                letra = fR.read();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("No se ha encontrado ningún archivo el archivo");
        }
        catch(IOException e) {
            System.out.println("Error de entrada y/o salida");
        }
        finally{
            if(fR != null) {
                try {
                    fR.close();
                }
                catch(IOException e) {
                    System.out.println("Error de entrada y/o salida");
                }
            }

        }
    }
}