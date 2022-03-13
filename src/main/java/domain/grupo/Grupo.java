package domain.grupo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.UsuarioId;
import domain.grupo.value.GrupoId;

import java.util.List;
import java.util.Set;

public class Grupo extends AggregateEvent<GrupoId> {

    protected Evento evento;
    protected Calendario calendario;
    protected Discusion discucion;
    protected Set<UsuarioId> usuarioId;

    public Grupo(GrupoId grupoId){
        super(grupoId);
        subscribe(new GrupoEventChange(this));
    }
    public static Grupo from (GrupoId grupoId, List<DomainEvent> eventList){
        Grupo grupo = new Grupo(grupoId);
        eventList.forEach(grupo::applyEvent);
        return grupo;
    }


}
