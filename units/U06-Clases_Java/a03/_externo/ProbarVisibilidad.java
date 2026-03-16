package a03._externo;
import a03.CuentaCorriente;
public class ProbarVisibilidad {
    public static void main(String[] args) {
        CuentaCorriente cc2 = new CuentaCorriente("03928491K", "Daniel", 2300);
        //cc2.saldo *= 100; Da error
        //System.out.println(cc2.dni); Aquí da error porque no es público, y la clase es vecina
        System.out.println(cc2.nombre); //Funciona porque es público
    }
}
