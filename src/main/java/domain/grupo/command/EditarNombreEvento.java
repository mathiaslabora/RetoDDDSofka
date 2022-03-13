package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Nombre;
import domain.grupo.Evento;
import domain.grupo.value.EventoId;

public class EditarNombreEvento extends Command {
    private final EventoId eventoId;
    private final Nombre nombre;

    public EditarNombreEvento(EventoId eventoId, Nombre nombre) {
        this.eventoId = eventoId;
        this.nombre = nombre;
    }

    public EventoId getEventoId() {
        return eventoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
