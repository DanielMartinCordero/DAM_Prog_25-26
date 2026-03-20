package a01;

interface DispositivoConectado {
    String TIPO_RED = "Wi-Fi 7";

    void encender();

    void apagar();

    default void conectar(){
        System.out.println("Dispositivo conectado a "+TIPO_RED);
    }

    static void mostrarInfoGeneral(){
        System.out.println("Red "+TIPO_RED);
    }
}
