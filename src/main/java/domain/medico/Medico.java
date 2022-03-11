package domain.medico;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.medico.value.Especializacion;
import domain.medico.value.MedicoId;

public class Medico extends AggregateEvent<MedicoId> {
    protected Especializacion especializacion;
    protected Mensaje mensaje;





}
