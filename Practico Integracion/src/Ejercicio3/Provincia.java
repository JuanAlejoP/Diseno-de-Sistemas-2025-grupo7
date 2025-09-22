package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad c) {
        ciudades.add(c);
    }

    public List<Ciudad> getCiudadesEnDeficit() {
        List<Ciudad> enDeficit = new ArrayList<>();
        for (Ciudad c : ciudades) {
            if (c.estaEnDeficit()) {
                enDeficit.add(c);
            }
        }
        return enDeficit;
    }

    public boolean tieneDeficitGeneral() {
        int deficit = 0;
        for (Ciudad c : ciudades) {
            if (c.estaEnDeficit()) deficit++;
        }
        return deficit > ciudades.size() / 2;
    }

    public String getNombre() {
        return nombre;
    }
}