package domain.grupo;

import co.com.sofka.domain.generic.Entity;
import domain.grupo.value.DiscusionId;
import domain.grupo.value.GrupoId;
import domain.grupo.value.Tematica;

public class Discusion extends Entity<DiscusionId> {
    private Tematica tematica;
    private GrupoId grupoId;

    public Discusion(DiscusionId entityId, Tematica tematica, GrupoId grupoId) {
        super(entityId);
        this.tematica = tematica;
        this.grupoId = grupoId;
    }

    public Tematica Tematica() {
        return tematica;
    }

    public GrupoId GrupoId() {
        return grupoId;
    }
}
