package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.grupo.value.CalendarioId;
import domain.grupo.value.Reunion;

public class EditarReunionCalendario  extends Command {
private final CalendarioId calendarioId;
private final Reunion reunion;

    public EditarReunionCalendario(CalendarioId calendarioId, Reunion reunion) {
        this.calendarioId = calendarioId;
        this.reunion = reunion;
    }

    public CalendarioId getCalendarioId() {
        return calendarioId;
    }

    public Reunion getReunion() {
        return reunion;
    }
}
