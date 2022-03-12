package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Nombre;
import domain.generic.UsuarioId;

public class CambiarDestinatarioDeMensaje extends Command {

    private final Nombre nombre;
    private final UsuarioId usuarioId;

    public CambiarDestinatarioDeMensaje(Nombre nombre, UsuarioId usuarioId) {
        this.nombre = nombre;
        this.usuarioId = usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
