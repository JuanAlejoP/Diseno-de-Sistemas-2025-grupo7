package Ejercicio10;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 10 ---");
        SedeOlimpica sede = new SedeOlimpica();
        ComplejoUnideportivo cu = new ComplejoUnideportivo();
        Polideportivo pol = new Polideportivo();
        sede.setComplejos(Arrays.asList(cu, pol));
        AreaDesignada area = new AreaDesignada();
        cu.setAreas(Arrays.asList(area));
        Evento evento = new Evento();
        cu.setEventos(Arrays.asList(evento));
        Comisario com = new Comisario();
        evento.setComisarios(Arrays.asList(com));
        Material mat = new Material();
        evento.setMateriales(Arrays.asList(mat));
        System.out.println("Sede con complejos: " + sede.getComplejos().size());
        System.out.println("Complejo con áreas: " + cu.getAreas().size());
        System.out.println("Evento con comisarios: " + evento.getComisarios().size());
    }
}