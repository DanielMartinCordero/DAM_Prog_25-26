package a03;
import a01.Hora;

public class HoraExactaEquals extends Hora {
        private byte seg;
        HoraExactaEquals(byte hora, byte min, byte seg){
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

        @Override
        public String toString(){
            return String.format("%02d:%02d:%02d", super.getHora(), super.getMin(), seg);
        }
        @Override
        public boolean equals(Object hora) {
            HoraExactaEquals otraHora = (HoraExactaEquals) hora;
            boolean iguales = false;
            if(this.getHora() == otraHora.getHora() && this.getMin() == otraHora.getMin() && this.getSeg() == otraHora.getSeg() ){
                iguales = true;
            }
            return iguales;
        }
}
