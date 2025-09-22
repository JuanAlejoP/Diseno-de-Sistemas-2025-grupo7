package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Restaurante> restaurantesHabituales;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.restaurantesHabituales = new ArrayList<>();
    }

    public void agregarRestauranteHabitual(Restaurante r) {
        restaurantesHabituales.add(r);
    }

    public String getNombre() {
        return nombre;
    }
}
