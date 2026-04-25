package a02;
/*2. Implementa una aplicación que pida por consola números enteros no negativos hasta que se
introduzca un -1 (el -1 no se guarda).
• Los números se irán insertando en una colección, pudiéndose repetir.
• Al terminar, se mostrará la colección por pantalla.
• A continuación, se mostrarán todos los valores pares.
• Por último, se eliminarán todos los múltiplos de 3 usando un iterador y se mostrará por pantalla la
colección resultante.*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Collection<Integer> listaNum = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Si quiere cerrar el programa, introduzca -1");

        do{
            System.out.println("Añada un número");
            num = sc.nextInt();
            if (num>=0){
                listaNum.add(num);
            }
            else {
                System.out.println("No se puede añadir a la lista, los números negativos no son válidos.");
            }
        }while(num !=-1);
        System.out.println("Fin del bucle");
        System.out.println("Resultados: ");
        System.out.println(listaNum);

        System.out.println("Valores pares: ");
        for(Integer i : listaNum){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("Revisando la lista para eliminar múltiplos de 3...");
        Iterator<Integer> it  = listaNum.iterator();
        Integer numeroActual;
        while(it.hasNext()){
            numeroActual = it.next();
            if(numeroActual%3==0){
                System.out.println("Múltiplo de 3 encontrado: "+numeroActual);
                it.remove();
            }

        }
        System.out.println("Lista sin múltiplos de 3: ");
        System.out.println(listaNum);
    }
}
