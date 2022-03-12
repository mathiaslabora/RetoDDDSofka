package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.PublicacionMedicaId;
import domain.usuario.value.PublicacionConsultaId;

public class ContenidoDePublicacionConsultaEditado extends DomainEvent {

    private final PublicacionConsultaId publicacionConsultaId;

    public ContenidoDePublicacionConsultaEditado(PublicacionConsultaId publicacionConsultaId){
        super("PublicacionConsulta.ContenidoDePublicacionConsultaEditado");
        this.publicacionConsultaId = publicacionConsultaId;

    }




}
