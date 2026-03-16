package a06;
/* Escribir un programa que lea por teclado una hora, minutos y segundos y un número n de
veces:
• EI programa mostrará la hora completa introducida y las n siguientes, que se diferencian
en más un segundo.
• Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora,
minuto y segundo.
• Los valores de los atributos se controlarán mediante métodos set/get*/
public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(11, 32, 46);
        Hora hora2 = new Hora(12, 59, 58);


        hora2.mostrarHora();
        hora1.mostrarHora();

        hora2.incrementoSegundo(2); //Suma 2 veces, y al llegar a 59 convierte en 0 los segundos y minutos, sumando una hora.

        //Muestra que no son válidos los minutos y segundos, y los convierte en 0
        Hora hora3 = new Hora(17, 67, 98);

        hora3.mostrarHora();

        System.out.println(hora2.getHora());
    }
}
