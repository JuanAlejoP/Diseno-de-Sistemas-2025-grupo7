package Ejercicio5;

public class PreferenciaPlatoRestaurante {
    private Persona persona;
    private Restaurante restaurante;
    private Plato plato;
    private boolean leGusta;

    public PreferenciaPlatoRestaurante(Persona persona, Restaurante restaurante, Plato plato, boolean leGusta) {
        this.persona = persona;
        this.restaurante = restaurante;
        this.plato = plato;
        this.leGusta = leGusta;
    }

    public boolean isLeGusta() {
        return leGusta;
    }

    public String descripcion() {
        return persona.getNombre() + (leGusta ? " gusta " : " no gusta ")
                + plato.getNombre() + " en " + restaurante.getNombre();
    }
}