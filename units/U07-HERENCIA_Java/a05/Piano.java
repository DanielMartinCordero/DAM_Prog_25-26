package a05;


import a04.Instrumento;

public class Piano extends Instrumento {
    //Al igual que en instrumento, dejamos el constructor por defecto
    @Override
    public void interpretar() {
        
        IconosMusicales[] iconos = IconosMusicales.values();
        
        System.out.println("----------Interpretación en Piano----------");
         for(int i = 0; i<super.getNumNotas(); i++){ //No hago un forEach para evitar mostrar nulls
             int aleatorio = (int) (Math.random() * iconos.length);
             int aleatorio1 = aleatorio >= (iconos.length/2) ? aleatorio-1 : aleatorio+1;
             System.out.print(" | "+ iconos[aleatorio].getSimbolo() + " "+super.getNotas()[i]+" " + iconos[aleatorio1].getSimbolo() + " | ")
         }
        
        System.out.println("\n-------------------------------------------");
    }
}
