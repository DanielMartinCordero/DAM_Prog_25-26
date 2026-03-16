package Maquinaria;

import Personal.Maquinista;
import java.util.Arrays;

public class Tren {
   Locomotora locomotora;
   Vagon[] vagones = new Vagon[5];
   Maquinista maquinistaAsignado;
   byte contadorVagones =0;

   public Tren(Locomotora locomotora, Maquinista maquinistaAsignado) {
       this.locomotora = locomotora;
       this.maquinistaAsignado = maquinistaAsignado;
   }
   public void addVagon(int numIdentificador, double cargaMaxKg, double cargaActual, String tipoMercancia){
       if(contadorVagones<=4) {
           Vagon vagon1 = new Vagon(numIdentificador, cargaMaxKg, cargaActual, tipoMercancia);
           this.vagones[this.contadorVagones] = vagon1;
           ++contadorVagones;
       }
       else{
           System.out.println("No se pueden añadir mas vagones a este tren");
       }
   }

   public void mostrarInformacion(){
       System.out.println("La locomotora es: "+locomotora.toString());
       System.out.println("El tren esta formado por los siguientes vagones: "+Arrays.toString(vagones));
       System.out.println("El maquinista asignado es: "+maquinistaAsignado.toString());
       System.out.println("El tren tiene "+contadorVagones+" vagón/es");
   }

   public Locomotora getLocomotora() {
       return locomotora;
   }

   public void setLocomotora(Locomotora locomotora) {
       this.locomotora = locomotora;
   }

   public Vagon[] getVagones() {
       return vagones;
   }

   public void setVagones(Vagon[] vagones) {
       this.vagones = vagones.length <=5 ?  vagones : this.vagones;
   }

   public Maquinista getMaquinistaAsignado() {
       return maquinistaAsignado;
   }

   public void setMaquinistaAsignado(Maquinista maquinistaAsignado) {
       this.maquinistaAsignado = maquinistaAsignado;
   }

}
