package Ejercicio3;

public class Ciudad {
    private String nombre;
    private int habitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gasto;

    public Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gasto) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gasto = gasto;
    }

    public double getRecaudacionTotal() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean estaEnDeficit() {
        return gasto > getRecaudacionTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }
}