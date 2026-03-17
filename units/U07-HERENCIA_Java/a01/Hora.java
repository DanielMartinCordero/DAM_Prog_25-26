package a01;

public class Hora {
    private byte hora;
    private byte min;

    public Hora(byte hora, byte min){
        this.hora = hora <24 && hora>=0? hora:0;
        this.min = min<60 && min>=0? min:0;
    }
    public void inc(){
        if(min == 59) {
            hora++;
            min = 0;
            if (hora == 24) {
                hora = 0;
            }
        }
        else {
            min++;
        }
    }
    public byte getHora(){
        return hora;
    }
    public byte getMin(){
        return min;
    }
    public boolean setHora(byte hora){
        this.hora = hora <=23 && hora >=0 ? hora:this.hora;
        boolean esValida = this.hora == hora? true:false;
        return esValida;
    }
    public boolean setMin(byte min){
        this.min = min <=59 && min >=0 ? min:this.min;
        boolean esValido = this.min == min? true:false;
        return esValido;
    }
    @Override
    public String toString(){
        return "Hora actual: "+hora+":"+min;
    }
}
