package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Crear ciudad
        Ciudad ciudad = new Ciudad("Mendoza");

        // Crear restaurante y sucursal
        Restaurante r1 = new Restaurante("La Parrilla");
        r1.agregarSucursal(new Sucursal("Av. Siempre Viva 123"));

        // Crear platos
        Plato p1 = new Plato("Asado");
        Plato p2 = new Plato("Milanesa");
        r1.agregarPlato(p1);
        r1.agregarPlato(p2);

        // Agregar restaurante a la ciudad
        ciudad.agregarRestaurante(r1);

        // Crear persona
        Persona persona = new Persona("Luciano");
        persona.agregarRestauranteHabitual(r1);

        // Definir preferencia
        PreferenciaPlatoRestaurante pref = new PreferenciaPlatoRestaurante(persona, r1, p1, true);

        System.out.println(pref.descripcion());
    }
}