package a07;

public class Main {
    public static void main(String[] args) {
        Texto frase1 = new Texto(120);
        frase1.añadirCadena("Hola, esta es mi cadena");
        frase1.mostrarInformacion();

        frase1.addPrincipio("Ey, ");
        frase1.addFinal(". Un placer.");
        frase1.mostrarInformacion();

        frase1.addFinal('!');
        frase1.addPrincipio('¡');
        frase1.mostrarInformacion();
    }
}
