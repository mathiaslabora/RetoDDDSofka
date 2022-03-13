package domain.grupo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.grupo.value.DiscusionId;
import domain.medico.value.PublicacionMedicaId;

public class DiscusionCreada extends DomainEvent {
    private final DiscusionId discusionId;

    public DiscusionCreada(DiscusionId discusionId){
        super("Discusion.discusioncreada");
        this.discusionId = discusionId;

    }


}
