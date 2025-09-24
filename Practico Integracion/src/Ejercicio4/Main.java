package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 4 ---");
        Mineral m1 = new Mineral("Fosforo", true);
        Mineral m2 = new Mineral("Potasio", false);
        Lote lote = new Lote("Lote1");
        lote.agregarMineral(m1);
        lote.agregarMineral(m2);
        CerealCosechaFina cf = new CerealCosechaFina("Trigo");
        cf.agregarMineralRequerido(m1);
        System.out.println("¿Se puede sembrar trigo? " + cf.puedeSerSembradoEn(lote));
        Pastura pasto = new Pastura("Alfalfa");
        pasto.agregarMineralRequerido(m1);
        lote.registrarSiembra(pasto);
        System.out.println("¿Se puede volver a sembrar pastura? " + pasto.puedeSerSembradoEn(lote));
    }
}

