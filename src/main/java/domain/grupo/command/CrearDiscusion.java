package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.grupo.Grupo;
import domain.grupo.value.GrupoId;
import domain.grupo.value.Tematica;

public class CrearDiscusion extends Command {
    private final GrupoId grupoId;
    private final Tematica tematica;

    public CrearDiscusion(GrupoId grupoId, Tematica tematica) {
        this.grupoId = grupoId;
        this.tematica = tematica;
    }

    public GrupoId getGrupoId() {
        return grupoId;
    }

    public Tematica getTematica() {
        return tematica;
    }
}
