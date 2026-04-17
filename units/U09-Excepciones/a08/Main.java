package a08;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Nombre del fichero? (ej: documento.txt)");
        String nombreFichero = sc.nextLine();

        // Podemos abrir AMBOS flujos en el mismo try-with-resources
        try (BufferedReader bR = new BufferedReader(new FileReader("ficheros/" + nombreFichero));
             BufferedWriter bW = new BufferedWriter(new FileWriter("ficheros/copia_de_" + nombreFichero))) {

            String linea;
            // Leemos y comprobamos en una sola línea
            while ((linea = bR.readLine()) != null) {
                bW.write(linea);
                bW.newLine(); // readLine() quita el salto de línea, hay que ponerlo manual
            }

            System.out.println("Copia generada con éxito en la carpeta 'ficheros'");

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo original.");
        } catch (IOException e) {
            System.out.println("Error durante la copia: " + e.getMessage());
        }
    }
}