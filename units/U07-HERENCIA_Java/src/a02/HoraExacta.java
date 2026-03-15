package a02;
import a01.Hora;

public class HoraExacta extends Hora{
    byte seg;
    HoraExacta(byte hora, byte min, byte seg){
        super(hora, min);
        this.seg = seg;
    }
    public void inc(){
        seg++;
        if(seg==60){
            seg=0;
            super.inc();
        }
    }
    public boolean setSegundos(byte seg){
        boolean retorno = false;
        if(seg >=0 && seg <=59){
            this.seg = seg;
            retorno = true;
        }
        return retorno;
    }
    public byte getSeg(){
        return seg;
    }
    public void setSeg(byte seg){
        this.seg = seg;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", super.getHora(), super.getMin(), seg);
    }

}

