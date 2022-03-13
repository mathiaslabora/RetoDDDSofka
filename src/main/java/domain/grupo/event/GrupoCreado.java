package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;
import domain.grupo.Calendario;
import domain.grupo.Discusion;
import domain.grupo.Evento;

import java.util.Set;

public class GrupoCreado extends DomainEvent {

    protected Evento evento;
    protected Calendario calendario;
    protected Discusion discucion;
    protected Set<UsuarioId> usuarioId;

    public GrupoCreado(Evento evento, Calendario calendario, Discusion discucion, Set<UsuarioId> usuarioId) {
        super("Grupo.grupocreado");
        this.evento = evento;
        this.calendario = calendario;
        this.discucion = discucion;
        this.usuarioId = usuarioId;
    }

    public Evento getEvento() {
        return evento;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public Discusion getDiscucion() {
        return discucion;
    }

    public Set<UsuarioId> getUsuarioId() {
        return usuarioId;
    }
}
