package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.UsuarioId;
import domain.grupo.Evento;
import domain.grupo.value.GrupoId;

import java.util.Set;

public class CrearGrupo extends Command {

    private final GrupoId grupoId;
    private final Set<UsuarioId> usuarioId;

    public CrearGrupo(GrupoId grupoId, Set<UsuarioId> usuarioId) {
        this.grupoId = grupoId;
        this.usuarioId = usuarioId;
    }

    public GrupoId getGrupoId() {
        return grupoId;
    }

    public Set<UsuarioId> getUsuarioId() {
        return usuarioId;
    }
}
