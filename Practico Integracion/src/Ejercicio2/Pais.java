package Ejercicio2;

import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> limitaCon;  // países vecinos
    private Continente continente;

    public void setCapital(Ciudad capital) { this.capital = capital; }
    public void setProvincias(List<Provincia> provincias) { this.provincias = provincias; }
    public void setContinente(Continente continente) { this.continente = continente; }
    public Ciudad getCapital() { return capital; }
    public List<Provincia> getProvincias() { return provincias; }
    public Continente getContinente() { return continente; }
}