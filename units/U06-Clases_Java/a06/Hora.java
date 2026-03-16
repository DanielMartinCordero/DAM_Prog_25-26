package a06;

public class Hora {
    private byte hora; //Privates para que haya que pasar los filtros de los sets
    private byte min;
    private byte sec;

    Hora (int hora, int min, int sec){
        this.hora = (hora >= 0 && hora < 24) ? (byte)hora : 0;
        this.min = (min >= 0 && min < 60) ? (byte)min : 0;
        this.sec = (sec >= 0 && sec < 24) ? (byte)sec : 0;
    }

    void incrementoSegundo(int n){
        for(int i = 1; i<=n; i++){
            if(this.sec == 59){ //Compruebo cada parte de la hora
                this.sec = 0;
                if(this.min == 59){
                    this.min = 0;
                    if(this.hora == 23){
                        this.hora = 0;
                    }
                    else {
                        this.hora++;
                    }
                }
                else {
                    ++this.min;
                }
            }
            else{
                this.sec++;
            }
            System.out.println("Incremento "+i+":");
            System.out.printf("%02d:%02d:%02d\n", hora, min, sec); //Mínimo tiene que haber 2 números, si no aáde otro 0
        }
    }
    void mostrarHora(){
        System.out.println("La hora actual es: ");
        System.out.printf("%02d:%02d:%02d\n", hora, min, sec);
    }
    void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = (byte)hora;
        }
        else {
            System.out.println("Hora no valida");
            this.hora = 0;
        }
    }
    byte getHora(){
        return hora;
    }
    void setMin(int min) {
        if (min >= 0 && min < 60) {
            this.min = (byte)min;
        }
        else {
            System.out.println("Minuto no valido");
            this.min = 0;
        }
    }
    byte getMin(){
        return min;
    }
    void setSec(int sec){
        if(sec >= 0 && sec < 60) {
            this.sec = (byte)sec;
        }
        else{
            System.out.println("Segundo no valido");
            this.sec = 0;
        }
    }
    byte getSec(){
        return sec;
    }
}
