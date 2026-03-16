package a07;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    private int longitudMaxima;
    private String cadena = "";
    //DateTime para comprobar si es diferente la modificación de la creación
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private int contadorVocales;

    Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }
    public void añadirCadena(String cadena) {
        if (this.cadena.length() < this.longitudMaxima) {
            this.cadena = cadena;
            this.fechaActualizacion = LocalDateTime.now();
        } else {
            if (this.longitudMaxima > 0) {
                System.out.println("La longitud maxima debe estar entre 0 y " + longitudMaxima);
            } else {
                System.out.println("Debe añadir una logitud máxima antes");
            }
        }
    }

    public void addPrincipio(char añadirInicio) {
        if ((añadirInicio + this.cadena).length() < this.longitudMaxima) {
            this.cadena = añadirInicio + this.cadena;
        } else {
            System.out.println("No se ha podido añadir, supera la longitud máxima (" + longitudMaxima + ")");
        }
    }

    public void addPrincipio(String añadirInicio) {
        if ((añadirInicio + this.cadena).length() < this.longitudMaxima) {
            this.cadena = añadirInicio + this.cadena;
        } else {
            System.out.println("No se ha podido añadir, supera la longitud máxima (" + longitudMaxima + ")");
        }
    }

    public void addFinal(char añadirFinal) {
        if ((añadirFinal + this.cadena).length() < this.longitudMaxima) {
            this.cadena = this.cadena + añadirFinal;
        } else {
            System.out.println("No se ha podido añadir, supera la longitud máxima (" + longitudMaxima + ")");
        }
    }

    public void addFinal(String añadirFinal) {
        if ((añadirFinal + this.cadena).length() < this.longitudMaxima) {
            this.cadena = this.cadena + añadirFinal;
        } else {
            System.out.println("No se ha podido añadir, supera la longitud máxima (" + longitudMaxima + ")");
        }
    }

    public int numVocales() {
        int contadorVocales = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            char letraFrase = this.cadena.charAt(i);
            char letraMinuscula = Character.toLowerCase(letraFrase);

            if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
    public void mostrarInformacion(){
        System.out.println("La frase es: "+this.cadena);
        System.out.println("Su longitud es de "+ cadena.length());
        System.out.println("La longitud máxima es de "+ longitudMaxima);
        System.out.println("La cadena se creó en "+fechaCreacion);
        System.out.println("La última modificación se dió en "+fechaActualizacion);
        System.out.println("Tiene "+numVocales()+" vocales");
    }
}