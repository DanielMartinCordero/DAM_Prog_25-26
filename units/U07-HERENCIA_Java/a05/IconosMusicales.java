package a05;

public enum IconosMusicales {
    NEGRA("\u2669"),
    CORCHEA("\u266A"),
    DOS_CORCHEAS("\u266B"),
    CLAVE_SOL("\uD834\uDD1E")
    ;
    private String simbolo; //Aqui almacenamos el unicode
    IconosMusicales(String simbolo) {
        this.simbolo = simbolo;
    }
    public String getSimbolo() {
        return simbolo;
    }
}
