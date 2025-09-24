package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 5 ---");
        Ciudad ciudad5 = new Ciudad("Ciudad5");
        Restaurante rest = new Restaurante("Rico");
        Plato plato = new Plato("Pizza");
        rest.agregarPlato(plato);
        ciudad5.agregarRestaurante(rest);
        Persona persona = new Persona("Ana");
        persona.agregarRestauranteHabitual(rest);
        PreferenciaPlatoRestaurante pref = new PreferenciaPlatoRestaurante(persona, rest, plato, true);
        System.out.println(pref.descripcion());
    }
}

