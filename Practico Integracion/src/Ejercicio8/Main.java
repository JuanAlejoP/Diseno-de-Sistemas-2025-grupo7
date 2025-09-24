package Ejercicio8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 8 ---");
        TipoAvion tipoA = new TipoAvion();
        Hangar hangar = new Hangar();
        Avion avion = new Avion("ABC123", tipoA, hangar);
        Mecanico mec = null;
        Date fecha = new Date();
        Servicio s1 = new Servicio(avion, mec, fecha, 2, "Mantenimiento");
        Servicio s2 = new Servicio(avion, mec, fecha, 3, "Mantenimiento");
        System.out.println("Agregar primer servicio: " + avion.agregarServicio(s1));
        System.out.println("Agregar servicio duplicado: " + avion.agregarServicio(s2));
    }
}

