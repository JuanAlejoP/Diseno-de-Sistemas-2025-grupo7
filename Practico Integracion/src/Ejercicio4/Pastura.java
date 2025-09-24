package Ejercicio4;

public class Pastura extends Cereal {
    public Pastura(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSerSembradoEn(Lote lote) {
        return lote.tieneMineralesRequeridos(this) && !lote.haSembradoPastura();
    }
}