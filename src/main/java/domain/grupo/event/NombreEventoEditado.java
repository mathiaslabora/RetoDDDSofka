package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Nombre;
import domain.grupo.value.EventoId;
import domain.medico.value.PublicacionMedicaId;

public class NombreEventoEditado extends DomainEvent {
    private final EventoId eventoId;
private final Nombre nombre;
    public NombreEventoEditado(EventoId eventoId, Nombre nombre){
        super("Evento.nombreeventoeditado");
        this.eventoId = eventoId;
this.nombre = nombre;
    }

}
