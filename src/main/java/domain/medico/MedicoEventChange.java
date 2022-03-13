package domain.medico;

import co.com.sofka.domain.generic.EventChange;
import domain.grupo.Discusion;
import domain.grupo.event.DiscusionCreada;
import domain.medico.event.EspecializacionMedicoEditada;
import domain.medico.event.InformacionConferenciaActualizada;
import domain.medico.event.MedicoCreado;
import domain.medico.event.MensajeCreado;

public class MedicoEventChange extends EventChange {
    public MedicoEventChange (Medico medico){
        apply((MedicoCreado event) -> {
            medico.nombre = event.getNombre();
            medico.email = event.getEmail();
            medico.conferencia = event.getConferencia();
            medico.mensaje = event.getMensaje();
            medico.publicacionMedica = event.getPublicacionMedica();
            medico.especializacion = event.getEspecializacion();
        });
    apply((EspecializacionMedicoEditada event)->{
        medico.especializacion = event.getEspecializacion();
    });




    }
}

