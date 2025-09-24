package Ejercicio4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lote {
    private String nombre;
    private Set<Mineral> minerales;
    private List<Cereal> historialSiembras;

    public Lote(String nombre) {
        this.nombre = nombre;
        this.minerales = new HashSet<>();
        this.historialSiembras = new LinkedList<>();
    }

    public void agregarMineral(Mineral mineral) {
        minerales.add(mineral);
    }

    public void registrarSiembra(Cereal cereal) {
        historialSiembras.add(cereal);
    }

    public boolean tieneMineralesRequeridos(Cereal cereal) {
        return minerales.containsAll(cereal.getMineralesRequeridos());
    }

    public boolean haSembradoPastura() {
        return historialSiembras.stream().anyMatch(c -> c instanceof Pastura);
    }

    public boolean esEspecial() {
        return minerales.stream().anyMatch(Mineral::esPrimario);
    }

    public boolean esComun() {
        return minerales.stream().allMatch(m -> !m.esPrimario());
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Mineral> getMinerales() {
        return new HashSet<>(minerales);
    }

    public List<Cereal> getHistorialSiembras() {
        return new LinkedList<>(historialSiembras);
    }
}
