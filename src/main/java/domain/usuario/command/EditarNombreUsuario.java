package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Nombre;
import domain.generic.UsuarioId;

public class EditarNombreUsuario  extends Command {

    private final UsuarioId usuarioId;
    private final Nombre nombre;

    public EditarNombreUsuario(UsuarioId usuarioId, Nombre nombre) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
