package a03;

import java.io.*;

public class Main {
    public static final String RUTA = "C:\\GIT\\DAM_Prog_25-26\\units\\U07-Herencia_Java\\a00\\Cliente.java";

    public static void main(String[] args) {
        BufferedReader bF = null;
        try {
            bF = new BufferedReader(new FileReader(RUTA));
            String letra = bF.readLine();
            while (letra != null) {
                System.out.println(letra);
                letra = bF.readLine();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("No se ha encontrado ningún archivo el archivo");
        }
        catch(IOException e) {
            System.out.println("Error de entrada y/o salida");
        }
        finally{
            if(bF != null) {
                try {
                    bF.close();
                }
                catch(IOException e) {
                    System.out.println("Error de entrada y/o salida");
                }
            }

        }
    }
}

