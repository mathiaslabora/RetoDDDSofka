package domain.grupo.command;

import co.com.sofka.domain.generic.Command;
import domain.grupo.value.GrupoId;
import domain.grupo.value.Tematica;

public class EditarTematicaDiscusion  extends Command {
    private final Tematica tematica;
    private final GrupoId grupoId;


    public EditarTematicaDiscusion(Tematica tematica, GrupoId grupoId) {
        this.tematica = tematica;
        this.grupoId = grupoId;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public GrupoId getGrupoId() {
        return grupoId;
    }
}
