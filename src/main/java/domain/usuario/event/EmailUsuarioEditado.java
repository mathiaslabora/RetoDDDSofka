package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;
import domain.medico.value.MensajeId;

public class EmailUsuarioEditado extends DomainEvent {
    private final UsuarioId usuarioId;

    public EmailUsuarioEditado(UsuarioId usuarioId){
        super("Usuario.emailusuarioeditado");
        this.usuarioId = usuarioId;

    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
