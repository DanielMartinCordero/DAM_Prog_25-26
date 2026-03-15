package a03;

public class Main {
    public static void main(String[] args) {
        HoraExactaEquals h1 = new HoraExactaEquals((byte) 10, (byte) 30, (byte) 0);
        HoraExactaEquals h2 = new HoraExactaEquals((byte) 10, (byte) 30, (byte) 0);

        System.out.println(h1 == h2);      // Imprime false (son distintos espacios en memoria)
        System.out.println(h1.equals(h2)); // Imprime true (tienen el mismo tiempo)

        h2.setMin((byte) 54);
        System.out.println("Minuto cambiado, las horas no son iguales");
        System.out.println(h1.equals(h2)); //Imprimirá false
        h2.setMin((byte) 30);
        h1.setSeg((byte) 14);
        System.out.println("Minuto restablecido, segundos cambiados");
        System.out.println(h1.equals(h2));
        h1.setSeg((byte) 0);
        System.out.println("Horas iguales de nuevo");
        System.out.println(h1.equals(h2));
    }
}
