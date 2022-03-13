package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.grupo.Calendario;
import domain.grupo.value.CalendarioId;
import domain.grupo.value.Reunion;
import domain.medico.value.PublicacionMedicaId;

public class ReunionCalendarioEditada extends DomainEvent {

    private final CalendarioId calendarioId;
    private final Reunion reunion;

    public ReunionCalendarioEditada(CalendarioId calendarioId, Reunion reunion){
        super("Calendario.reunioncalendarioeditada");
        this.calendarioId = calendarioId;
        this.reunion = reunion;

    }




}
