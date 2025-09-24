package Ejercicio8;

import java.util.ArrayList;
import java.util.List;

class Avion {
    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<PropiedadAvion> historialPropietarios = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Avion(String matricula, TipoAvion tipo, Hangar hangar) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hangar = hangar;
    }

    public boolean agregarServicio(Servicio nuevoServicio) {
        for (Servicio s : servicios) {
            if (s.getFecha().equals(nuevoServicio.getFecha()) && s.getTipoTrabajo().equalsIgnoreCase(nuevoServicio.getTipoTrabajo())) {
                return false;
            }
        }
        servicios.add(nuevoServicio);
        return true;
    }
}
