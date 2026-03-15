package a01;

public class Main {
    public static void main(String[] args) {

        Hora hora1 = new Hora ((byte)10, (byte)25);
        hora1.inc();
        System.out.println(hora1); //Hora a mostrar 10:26

        // 1. Probar Constructor y toString
        System.out.println("--- Test 1: Creación y Formato ---");
        Hora h = new Hora((byte) 11, (byte) 30);
        System.out.println(h); // Debería mostrar 11:30

        // 2. Probar Setters con valores inválidos (Encapsulamiento)
        System.out.println("\n--- Test 2: Validación de Datos ---");
        System.out.println("¿Acepta hora 25?: " + h.setHora((byte) 25)); // false
        System.out.println("¿Acepta minutos 60?: " + h.setMin((byte) 60)); // false
        System.out.println("Estado tras fallos: " + h); // Sigue en 11:30

        // 3. Probar el incremento de minutos normal
        System.out.println("\n--- Test 3: Incremento Simple ---");
        h.setMin((byte) 58);
        h.inc();
        System.out.println("De 58 a 59: " + h); // 11:59

        // 4. Probar cambio de hora (El "punto crítico" de tu lógica)
        System.out.println("\n--- Test 4: Salto de Hora ---");
        h.inc();
        System.out.println("De 11:59 a 12:00: " + h); // 12:00

        // 5. Probar cambio de día (Medianoche)
        System.out.println("\n--- Test 5: Cambio de Día ---");
        h.setHora((byte) 23);
        h.setMin((byte) 59);
        System.out.println("Antes de medianoche: " + h);
        h.inc();
        System.out.println("Después de medianoche: " + h); // 00:00
    }
}
