package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.grupo.value.Direccion;
import domain.grupo.value.EventoId;

public class EditarDireccionEvento extends Command {
    private final EventoId eventoId;
    private final Direccion direccion;

    public EditarDireccionEvento(EventoId eventoId, Direccion direccion) {
        this.eventoId = eventoId;
        this.direccion = direccion;
    }

    public EventoId getEventoId() {
        return eventoId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
