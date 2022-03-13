package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.MensajeId;
import domain.usuario.value.SeguimientoId;

public class NotaSeguimientoCreada extends DomainEvent {
    private final SeguimientoId seguimientoId;

    public NotaSeguimientoCreada(SeguimientoId seguimientoId){
        super("Seguimiento.notaseguimientocreada");
        this.seguimientoId = seguimientoId;

    }

    public SeguimientoId getSeguimientoId() {
        return seguimientoId;
    }
}
