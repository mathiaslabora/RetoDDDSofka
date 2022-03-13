package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.grupo.value.DiscusionId;
import domain.grupo.value.Tematica;

public class TematicaDiscusionEditada extends DomainEvent {
    private final DiscusionId discusionId;
    private final Tematica tematica;

    public TematicaDiscusionEditada(DiscusionId discusionId, Tematica tematica){
        super("Discusion.tematicadiscusioneditada");
        this.tematica = tematica;
        this.discusionId = discusionId;
    }



}
