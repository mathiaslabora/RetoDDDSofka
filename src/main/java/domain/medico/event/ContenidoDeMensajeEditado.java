package domain.medico.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.MensajeId;

public class ContenidoDeMensajeEditado extends DomainEvent {
    private final MensajeId mensajeId;

    public ContenidoDeMensajeEditado(MensajeId mensajeId){
        super("Mensaje.contenidodemensajeeditado");
        this.mensajeId = mensajeId;

    }

    public MensajeId getMensajeId() {
        return mensajeId;
    }
}
