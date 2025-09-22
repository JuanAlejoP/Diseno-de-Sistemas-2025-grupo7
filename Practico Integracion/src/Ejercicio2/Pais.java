package Ejercicio2;

import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> limitaCon;  // países vecinos
    private Continente continente;
}