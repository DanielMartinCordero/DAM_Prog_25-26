package a08;

public class ControladorEmisora {
    private float frecuencia;
    private static float frecuenciaMin = 80.0f;
    private static float frecuenciaMax = 108.0f;

    ControladorEmisora( float frecuencia){
        if(frecuencia >= frecuenciaMin && frecuencia <= frecuenciaMax) {
            this.frecuencia = frecuencia;
        }
        else{
            this.frecuencia = frecuencia>frecuenciaMax?frecuenciaMax:frecuenciaMin;
        }
    }
    ControladorEmisora(){
        this.frecuencia = this.frecuenciaMin;
    }
    public void subirEmisora(int saltos){
        float frecuenciaParaAñadir;
        frecuenciaParaAñadir = saltos*0.5f;
        if((frecuencia+frecuenciaParaAñadir) >frecuenciaMax){
            frecuencia = frecuenciaMin;
            System.out.println("Se ha cambiado la frecuencia al valor mínimo, "+frecuencia);
        }
        else{
            frecuencia +=frecuenciaParaAñadir;
        }
    }
    public void bajarEmisora(int saltos){
        float frecuenciaParaBajar;
        frecuenciaParaBajar = saltos*0.5f;
        if((frecuencia-frecuenciaParaBajar) < frecuenciaMin){
            frecuencia = frecuenciaMax;
            System.out.println("Se ha cambiado la frecuencia al valor máximo, "+frecuencia);
        }
        else{
            frecuencia -=frecuenciaParaBajar;
        }
    }
    public void mostrarInformacion(){
        System.out.println("Frecuencia: "+frecuencia);
        System.out.println("Frecuencia minima: "+frecuenciaMin);
        System.out.println("Frecuencia maxima: "+frecuenciaMax);
    }
    public void setFrecuencia(float frecuencia){
        this.frecuencia = frecuencia;
    }
    public float getFrecuencia(){
        return this.frecuencia;
    }
    public void setFrecuenciaMin(float frecuenciaMin){
        this.frecuenciaMin = frecuenciaMin;
    }
    public float  getFrecuenciaMin(){
        return this.frecuenciaMin;
    }
    public void setFrecuenciaMax(float frecuenciaMax){
        this.frecuenciaMax = frecuenciaMax;
    }
    public float  getFrecuenciaMax(){
        return this.frecuenciaMax;
    }
}
