package a04;

public abstract class Instrumento {
    private Nota[] notas = new Nota[LONGITUD_TABLAS_NOTAS];
    private int numNotas = 0;
    private static final int LONGITUD_TABLAS_NOTAS = 100; //La longitud en una variable estática y final

    //Dejamos que el constructor por defecto de java construya los objetos, ya que no hay atributos que requieran inicializar

    public void add(Nota nota){
        if(numNotas < LONGITUD_TABLAS_NOTAS){
            notas[numNotas] = nota;
            numNotas++;
        }
    }
    public abstract void interpretar();
    public Nota[] getNotas() {
        return notas;
    }

    public int getNumNotas() {
        return numNotas;
    }
    public int getLongitudTablasNotas(){
        return LONGITUD_TABLAS_NOTAS;
    }
    public void setNotas(Nota[] notas) {
        if(notas.length == LONGITUD_TABLAS_NOTAS) {
            this.notas = notas;
            numNotas = 0;
            for(int i = 0; i < notas.length; i++){
                if(notas[i] != null){
                    numNotas++;
                }
            }
        }
    }
    public void setNumNotas(int numNotas) {
        if(numNotas < LONGITUD_TABLAS_NOTAS) {
            this.numNotas = numNotas;
        }
    }
}
