package domain.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.generic.UsuarioId;

import java.util.List;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected PublicacionConsulta publicacionConsulta;
    protected Chat chat;
    protected Email email;
    protected Seguimiento seguimiento;
    protected Nombre nombre;

    private Usuario(UsuarioId usuarioId){
        super(usuarioId);
        subscribe(new UsuarioEventChange(this));
    }

    public static Usuario from (UsuarioId usuarioId, List<DomainEvent> eventList){
        Usuario usuario = new Usuario(usuarioId);
        eventList.forEach(usuario::applyEvent);
        return usuario;
    }
}
