package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.generic.UsuarioId;
import domain.medico.value.MedicoId;
import domain.usuario.Usuario;

public class CrearUsuario extends Command {

    private final UsuarioId usuarioId;
    private final Nombre nombre;
    private final Email email;

    public CrearUsuario(UsuarioId usuarioId, Nombre nombre, Email email) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.email = email;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
