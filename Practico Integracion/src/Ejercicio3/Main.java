package Ejercicio3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 3 ---");
        Ciudad c1 = new Ciudad("CiudadA", 150000, 100, 100, 100, 100, 100, 600);
        Ciudad c2 = new Ciudad("CiudadB", 90000, 100, 100, 100, 100, 100, 200);
        Ciudad c3 = new Ciudad("CiudadC", 200000, 100, 100, 100, 100, 100, 700);
        Provincia p3 = new Provincia("Prov");
        p3.agregarCiudad(c1);
        p3.agregarCiudad(c2);
        p3.agregarCiudad(c3);
        Pais pais3 = new Pais();
        pais3.agregarProvincia(p3);
        System.out.println("Ciudades en déficit (>100k hab):");
        for (Ciudad ci : pais3.getCiudadesEnDeficit()) System.out.println(ci.getNombre());
        System.out.println("Provincias en déficit:");
        for (Provincia pr : pais3.getProvinciasEnDeficit()) System.out.println(pr.getNombre());
    }
}

