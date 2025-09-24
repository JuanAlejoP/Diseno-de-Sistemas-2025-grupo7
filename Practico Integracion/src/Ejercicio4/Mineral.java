package Ejercicio4;


public class Mineral {
    private String nombre;
    private boolean esPrimario;

    public Mineral(String nombre, boolean esPrimario) {
        this.nombre = nombre;
        this.esPrimario = esPrimario;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrimario() {
        return esPrimario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mineral mineral = (Mineral) o;
        return nombre.equalsIgnoreCase(mineral.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
}
