package Ejercicio10;

import java.util.Date;
import java.util.List;

class Evento {
    private Date fecha;
    private double duracion;
    private int numParticipantes;
    private int numComisarios;
    private List<Comisario> comisarios;
    private List<Material> materiales;

    public void setComisarios(List<Comisario> comisarios) { this.comisarios = comisarios; }
    public List<Comisario> getComisarios() { return comisarios; }
    public void setMateriales(List<Material> materiales) { this.materiales = materiales; }
    public List<Material> getMateriales() { return materiales; }
}