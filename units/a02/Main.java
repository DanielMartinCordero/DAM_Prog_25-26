package a02;

public class Main {
    public static void main(String[] args) {
        // 1. Test de construcción y herencia
        System.out.println("--- Test 1: Inicio del día ---");
        HoraExacta reloj = new HoraExacta((byte)0, (byte)0, (byte)0);
        System.out.println(reloj); // Debería ser 00:00:00

        // 2. Test de validación (Encapsulamiento)
        System.out.println("\n--- Test 2: Intentando valores absurdos ---");
        boolean ok = reloj.setSegundos((byte)61);
        System.out.println("¿Acepta 61 segundos?: " + ok); // false
        System.out.println("Reloj tras fallo: " + reloj); // No debería haber cambiado

        // 3. Test de desborde de segundos (Salto de minuto)
        System.out.println("\n--- Test 3: Salto de minuto (59s -> 00s) ---");
        reloj.setSegundos((byte)59);
        System.out.println("Antes: " + reloj);
        reloj.inc(); // Aquí se ejecuta tu lógica de super.inc()
        System.out.println("Después: " + reloj); // Debería ser 00:01:00

        // 4. Test de desborde total (El "Final Boss")
        System.out.println("\n--- Test 4: Cambio de día (23:59:59 -> 00:00:00) ---");
        reloj.setHora((byte)23);
        reloj.setMin((byte)59);
        reloj.setSegundos((byte)59);
        System.out.println("Fin del mundo: " + reloj);
        reloj.inc();
        System.out.println("Nuevo día: " + reloj); // Debería ser 00:00:00


        // 5. Test de herencia de métodos
        System.out.println("\n--- Test 5: Uso de métodos del padre ---");
        // Aunque es HoraExacta, puede usar getHora() porque hereda de Hora
        System.out.println("Solo la hora actual: " + reloj.getHora());

    }
}
