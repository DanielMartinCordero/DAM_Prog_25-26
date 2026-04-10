package a02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileReader fR = null;
        try {
            fR = new FileReader("C:\\GIT\\DAM_Prog_25-26\\units\\U09-Excepciones\\a01\\MainRecursivo.java");

        }
        catch(FileNotFoundException | IOException e) {
            System.out.println("No se ha encontrado ningún archivo el archivo");
        }
        finally{
            fR.close();
        }
    }
}