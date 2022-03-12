package domain.medico;

import co.com.sofka.domain.generic.EventChange;
import domain.medico.event.MedicoCreado;

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


    }
}

