package domain.medico.event;


import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.medico.value.Destinatario;
import domain.medico.value.MensajeId;

public class MensajeCreado extends DomainEvent {
    private final MensajeId mensajeId;
    private final Fecha fecha;
    private Contenido contenido;
    private Destinatario destinatario;

    public MensajeCreado(MensajeId mensajeId, Fecha fecha, Contenido contenido, Destinatario destinatario) {
        super("Mensaje.mensajecreado");
        this.mensajeId = mensajeId;
        this.fecha = fecha;
        this.contenido = contenido;
        this.destinatario = destinatario;
    }

    public MensajeId getMensajeId() {
        return mensajeId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }
}

