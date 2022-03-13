package domain.grupo;

import co.com.sofka.domain.generic.Entity;
import domain.grupo.value.CalendarioId;
import domain.grupo.value.Reunion;

public class Calendario extends Entity<CalendarioId> {
    private Reunion reunion;

    public Calendario(CalendarioId entityId, Reunion reunion) {
        super(entityId);
        this.reunion = reunion;
    }

    public Reunion getReunion() {
        return reunion;
    }
}
