package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private List<Provincia> provincias;
    private String nombre;

    public Pais() {
        this.provincias = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarProvincia(Provincia p) {
        provincias.add(p);
    }

    public List<Ciudad> getCiudadesEnDeficit() {
        List<Ciudad> resultado = new ArrayList<>();
        for (Provincia p : provincias) {
            resultado.addAll(p.getCiudadesEnDeficit());
        }
        return resultado;
    }

    public List<Provincia> getProvinciasEnDeficit() {
        List<Provincia> resultado = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.tieneDeficitGeneral()) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}