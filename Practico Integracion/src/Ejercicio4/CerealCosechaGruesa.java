package Ejercicio4;

public class CerealCosechaGruesa extends Cereal {
    public CerealCosechaGruesa(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSerSembradoEn(Lote lote) {
        return lote.tieneMineralesRequeridos(this);
    }
}
