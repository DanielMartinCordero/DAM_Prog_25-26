package a01;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Integer[] numero = {21, 22, 23};
        String[] texto = {"Prueba de genéricos", "Prueba2", "Prueba3"};

        String[] tablaNuevaTextos = guardar("Texto añadido al final",texto);
        System.out.println(tablaNuevaTextos[tablaNuevaTextos.length-1]);

        Integer[] tablaNuevaNumeros = guardar(111111, numero);
        System.out.println(tablaNuevaNumeros[tablaNuevaNumeros.length-1]);
    }
    static <T> T[] guardar (T elemento, T tabla []){
        T[] resultado = Arrays.copyOf(tabla, tabla.length+1);

        resultado[resultado.length-1] = elemento;

        return resultado;
    }
}
