package Maquinaria;

class Vagon {
    private int numIdentifcador;
    private double cargaMaxKg;
    private double cargaActual;
    private String tipoMercancia;

    Vagon(int numIdentifcador, double cargaMaxKg, double cargaActual, String tipoMercancia) {
        this.numIdentifcador = numIdentifcador;
        this.cargaMaxKg = cargaMaxKg;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
     int getNumIdentifcador() {
        return numIdentifcador;
    }
     void setNumIdentifcador(int numIdentifcador) {
        this.numIdentifcador = numIdentifcador;
    }
     double getCargaMaxKg() {
        return cargaMaxKg;
    }
     void setCargaMaxKg(double cargaMaxKg) {
        this.cargaMaxKg = cargaMaxKg;
    }
     double getCargaActual() {
        return cargaActual;
    }
     void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }
     String getTipoMercancia() {
        return tipoMercancia;
    }
    void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
