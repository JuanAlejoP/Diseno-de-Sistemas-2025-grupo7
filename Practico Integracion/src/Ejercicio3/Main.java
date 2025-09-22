package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear ciudades
        Ciudad c1 = new Ciudad("Ciudad A", 1000, 2000, 3000, 1000, 500, 9000);
        Ciudad c2 = new Ciudad("Ciudad B", 2000, 3000, 1000, 500, 500, 4000);
        Ciudad c3 = new Ciudad("Ciudad C", 500, 500, 500, 500, 500, 4000);

        // Crear provincias y agregarlas
        Provincia p1 = new Provincia("Provincia 1");
        p1.agregarCiudad(c1);
        p1.agregarCiudad(c2);

        Provincia p2 = new Provincia("Provincia 2");
        p2.agregarCiudad(c3);

        // Crear país
        Pais pais = new Pais();
        pais.agregarProvincia(p1);
        pais.agregarProvincia(p2);

        // Mostrar ciudades en déficit
        System.out.println("Ciudades en déficit:");
        for (Ciudad c : pais.getCiudadesEnDeficit()) {
            System.out.println(" - " + c.getNombre());
        }

        // Mostrar provincias con déficit general
        System.out.println("\nProvincias en déficit:");
        for (Provincia p : pais.getProvinciasEnDeficit()) {
            System.out.println(" - " + p.getNombre());
        }
    }
}