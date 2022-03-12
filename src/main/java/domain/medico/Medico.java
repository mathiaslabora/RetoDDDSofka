package domain.medico;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.medico.value.Especializacion;
import domain.medico.value.MedicoId;

import java.util.List;

public class Medico extends AggregateEvent<MedicoId> {
    protected Especializacion especializacion;
    protected Email email;
    protected Nombre nombre;
    protected Mensaje mensaje;
    protected PublicacionMedica publicacionMedica;
    protected Conferencia conferencia;


private Medico (MedicoId medicoId){
    super(medicoId);
    subscribe(new MedicoEventChange(this));
}

public static Medico from (MedicoId medicoid, List<DomainEvent> eventList){
    Medico medico = new Medico(medicoid);
    eventList.forEach(medico::applyEvent);
    return medico;
}


}
