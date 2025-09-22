package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Plato> platos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.platos = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public void agregarPlato(Plato p) {
        if (platos.size() < 20) {
            platos.add(p);
        } else {
            System.out.println("No se pueden agregar más de 20 platos.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
