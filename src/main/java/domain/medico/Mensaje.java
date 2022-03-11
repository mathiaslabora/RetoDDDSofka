package domain.medico;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.medico.value.Destinatario;
import domain.medico.value.MensajeId;

public class Mensaje extends Entity<MensajeId> {
    private final Fecha fecha;
    private Contenido contenido;
    private Destinatario destinatario;

    public Mensaje(MensajeId entityId, Fecha fecha, Contenido contenido, Destinatario destinatario) {
        super(entityId);
        this.fecha = fecha;
        this.contenido = contenido;
        this.destinatario = destinatario;
    }



    public Fecha Fecha() {
        return fecha;
    }

    public Contenido Contenido() {
        return contenido;
    }

    public Destinatario Destinatario() {
        return destinatario;
    }
}
