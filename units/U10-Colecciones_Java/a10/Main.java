package a10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Socio> socios = new HashSet<>();
        Socio socio1 = new Socio("111A", "Pablo");
        Socio socio2 = new Socio("222B", "Gerardo");
        Socio socio3 = new Socio("333C", "Pepe");
        Socio socio4 = new Socio("111A", "Lucía");
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);

        System.out.println(socios);

        socios.add(socio4);

        System.out.println(socios); //No se inserta ya que hemos implementado Comparable por DNI en la clase Socio

        TreeSet<Socio> sociosOrdenados = new TreeSet<>(socios);

        System.out.println(sociosOrdenados);

        List<Socio> listaSocios = new ArrayList<>(sociosOrdenados);

        Socio segundoSocio = listaSocios.get(1);

        System.out.println("El segundo socio es: " + segundoSocio);
    }
}
