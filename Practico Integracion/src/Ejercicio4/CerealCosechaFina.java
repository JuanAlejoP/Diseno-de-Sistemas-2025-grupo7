package Ejercicio4;

public class CerealCosechaFina extends Cereal {
    public CerealCosechaFina(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSerSembradoEn(Lote lote) {
        return lote.tieneMineralesRequeridos(this);
    }
}
