package Ejercicio2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2 ---");
        Ciudad capitalProv = new Ciudad();
        Ciudad otraCiudad = new Ciudad();
        Provincia provincia = new Provincia();
        provincia.setCapital(capitalProv);
        provincia.setCiudades(Arrays.asList(capitalProv, otraCiudad));
        Pais pais = new Pais();
        pais.setCapital(capitalProv);
        pais.setProvincias(Arrays.asList(provincia));
        Continente continente = new Continente();
        pais.setContinente(continente);
        System.out.println("País creado con capital y provincias. Relaciones establecidas correctamente.");
    }
}
