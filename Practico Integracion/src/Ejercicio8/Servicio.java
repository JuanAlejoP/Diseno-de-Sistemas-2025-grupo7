package Ejercicio8;

import java.util.Date;

class Servicio {
    private Avion avion;
    private Mecanico mecanico;
    private Date fecha;
    private int horasInvertidas;
    private String tipoTrabajo;

    public Servicio(Avion avion, Mecanico mecanico, Date fecha, int horasInvertidas, String tipoTrabajo) {
        this.avion = avion;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    // Restricción: no puede haber dos servicios con misma fecha y tipoTrabajo para un avión
}
