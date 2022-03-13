package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;
import domain.medico.value.MensajeId;

public class NombreUsuarioEditado extends DomainEvent {
    private final UsuarioId usuarioId;

    public NombreUsuarioEditado(UsuarioId usuarioId){
        super("Usuario.nombreusuarioeditado");
        this.usuarioId = usuarioId;

    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
