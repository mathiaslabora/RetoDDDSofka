package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.grupo.value.Direccion;
import domain.grupo.value.EventoId;
import domain.medico.value.PublicacionMedicaId;

public class DireccionEventoEditada extends DomainEvent {
    private final EventoId eventoId;
    private final Direccion direccion;

    public DireccionEventoEditada(EventoId eventoId, Direccion direccion){
        super("Evento.direccioneventoeditada");
        this.eventoId = eventoId;
        this.direccion = direccion;

    }



}
