package domain.medico.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.MensajeId;
import domain.medico.value.PublicacionMedicaId;

public class ContenidoDePublicacionMedicaEditado extends DomainEvent {

    private final PublicacionMedicaId publicacionMedicaId;

    public ContenidoDePublicacionMedicaEditado(PublicacionMedicaId publicacionMedicaId){
        super("PublicacionMedica.contenidodepublicacionmedicaeditado");
        this.publicacionMedicaId = publicacionMedicaId;

    }




}
