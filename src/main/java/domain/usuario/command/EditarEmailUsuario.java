package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Email;
import domain.generic.UsuarioId;

public class EditarEmailUsuario  extends Command {

    private final UsuarioId usuarioId;
    private final Email email;


    public EditarEmailUsuario(UsuarioId usuarioId, Email email) {
        this.usuarioId = usuarioId;
        this.email = email;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Email getEmail() {
        return email;
    }
}
