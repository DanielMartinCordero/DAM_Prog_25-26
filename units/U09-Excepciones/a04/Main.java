package a04;

import java.io.*;

public class Main {
    public static final String RUTA = "C:\\Users\\ALUMNO\\Desktop\\NumerosReales.txt";
    public static BufferedReader bF = null;

    static double[] recolectarNumeros() throws IOException, FileNotFoundException {

        double[] sumaMedia = new double[2];
        double suma = 0.0;

        bF = new BufferedReader(new FileReader(RUTA));
        String letra = bF.readLine();

        if(letra!=null){
            String[] numeros = letra.split(" ");

            for(int i=0; i<numeros.length; i++){
                try {
                    suma += Double.parseDouble(numeros[i]);
                }
                catch(NumberFormatException e){
                    System.out.println("Error al obtener un número");
                }
            }
            sumaMedia[0] = suma;
            sumaMedia[1] = suma/numeros.length;
        }
        return sumaMedia;
    }

    public static void main(String[] args) {

        try{
            double[] resultados = recolectarNumeros();
            System.out.println("La suma de todos los números es: "+resultados[0]);
            System.out.println("La media aritmética es: "+resultados[1]);
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println("Error de entrada y/o salida");
            System.out.println(e);
        }
        finally{
            try {
                bF.close();
            }
            catch(IOException e) {
                System.out.println("Error de entrada y/o salida");
                System.out.println(e);
            }
        }
    }
}
