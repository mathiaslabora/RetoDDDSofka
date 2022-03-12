package domain.medico.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.Especializacion;
import domain.medico.value.MensajeId;

public class EspecializacionMedicoEditada extends DomainEvent {
    private final Especializacion especializacion;

    public EspecializacionMedicoEditada(Especializacion especializacion){
        super("Especializacion.especializacionmedicoeditada");
        this.especializacion = especializacion;

    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }
}
