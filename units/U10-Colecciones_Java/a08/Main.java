package a08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Inicialización rápida y dinámica
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));

        System.out.println("Comprobamos si son iguales las dos listas: ");
        System.out.println(listaA.equals(listaB));

        //Podríamos sumar 1 si queremos evitar que empiece desde la posición 0
        System.out.println("Primera posición en la que aparece el nombre \"Luis\": "+listaA.indexOf("Luis"));
        System.out.println("Última posición en la que aparece el nombre \"Luis\": "+listaA.lastIndexOf("Luis"));

        listaA.sort(null);

        System.out.println("Lista A en orden alfabético: ");
        System.out.println(listaA);

        System.out.println("Volvemos a comprobar si son iguales:");
        System.out.println(listaA.equals(listaB));

        listaA.sort(Comparator.reverseOrder());

        System.out.println("Lista A en orden alfabético inverso: ");
        System.out.println(listaA);
    }
}
