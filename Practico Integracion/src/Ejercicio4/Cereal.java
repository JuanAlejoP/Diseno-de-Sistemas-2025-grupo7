package Ejercicio4;

import java.util.HashSet;
import java.util.Set;

public abstract class Cereal {
    private String nombre;
    private Set<Mineral> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMineralRequerido(Mineral mineral) {
        mineralesRequeridos.add(mineral);
    }

    public Set<Mineral> getMineralesRequeridos() {
        return new HashSet<>(mineralesRequeridos);
    }

    public abstract boolean puedeSerSembradoEn(Lote lote);
}
