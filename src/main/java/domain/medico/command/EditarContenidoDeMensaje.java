package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Contenido;
import domain.medico.value.MensajeId;

public class EditarContenidoDeMensaje extends Command {

    private final MensajeId mensajeId;
    private final Contenido contenido;

    public EditarContenidoDeMensaje(MensajeId mensajeId, Contenido contenido) {
        this.mensajeId = mensajeId;
        this.contenido = contenido;
    }

    public MensajeId getMensajeId() {
        return mensajeId;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
