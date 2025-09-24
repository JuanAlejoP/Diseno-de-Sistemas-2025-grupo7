package Ejercicio10;

import java.util.List;

public class SedeOlimpica {
    private int numComplejos;
    private double presupuesto;
    private List<ComplejoDeportivo> complejos;

    public void setComplejos(List<ComplejoDeportivo> complejos) { this.complejos = complejos; }
    public List<ComplejoDeportivo> getComplejos() { return complejos; }
}