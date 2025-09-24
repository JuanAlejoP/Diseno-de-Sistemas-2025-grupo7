package Ejercicio10;

import java.util.List;

abstract class ComplejoDeportivo {
    private String localizacion;
    private String jefeOrganizacion;
    private double areaOcupada;
    private List<AreaDesignada> areas;
    private List<Evento> eventos;

    public void setAreas(List<AreaDesignada> areas) { this.areas = areas; }
    public List<AreaDesignada> getAreas() { return areas; }
    public void setEventos(List<Evento> eventos) { this.eventos = eventos; }
    public List<Evento> getEventos() { return eventos; }
}