package a08;
/*8. Definir una clase que permita controlar un sintonizador digital de emisoras FM:
• Concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar
(down) la frecuencia (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento
dado (display).
• Supondremos que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y
que, al inicio, el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por
defecto.
• Si durante una operación de subida o bajada se sobrepasa uno de los dos límites, la frecuencia
sintonizada debe pasar a ser la del extremo contrario (comprobarRango).
• Escribir un pequeño programa principal para probar su funcionamiento (Main.java)

 */
public class Main {
    public static void main(String[] args) {
        ControladorEmisora radio1 = new ControladorEmisora();
        ControladorEmisora radio2 = new ControladorEmisora(102.0f);
        radio1.mostrarInformacion();
        radio2.mostrarInformacion();

        radio1.subirEmisora(3);
        radio1.mostrarInformacion();


        radio2.bajarEmisora(3);
        radio2.mostrarInformacion();

        radio1.subirEmisora(120);
        radio1.mostrarInformacion();

        radio2.bajarEmisora(120);
        radio2.mostrarInformacion();


    }
}
