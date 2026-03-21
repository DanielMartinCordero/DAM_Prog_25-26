package a04;

public class ImpresoraAvanzada implements Multifuncion{

    @Override
    public void escanear(String documento, String correo){
        System.out.println("Documento "+ documento +" escaneado y enviado a "+correo);
    }

    @Override
    public void imprimir(int cantidad, String documento){
        System.out.println("Imprimiendo...");
        for(int i =1; i<=cantidad; i++) { //Para mostrar el número de documento que se esta imprimiendo
            System.out.println("Imprimiendo "+documento+" ("+i+")");
        }
        System.out.println("Proceso terminado");
    }
}
