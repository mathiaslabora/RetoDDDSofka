package domain.grupo.value;

import co.com.sofka.domain.generic.Identity;
import domain.medico.value.ConferenciaId;

public class EventoId extends Identity {
    private EventoId(String id){
        super(id);
    }

    public EventoId(){ }

    public static EventoId of(String id) {
        return new EventoId(id);
    }
}