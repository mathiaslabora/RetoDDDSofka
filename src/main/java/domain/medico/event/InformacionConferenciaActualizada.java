package domain.medico.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.Informacion;

public class InformacionConferenciaActualizada  extends DomainEvent {

    private final Informacion informacion;

    public InformacionConferenciaActualizada(Informacion informacion) {
        super("Conferencia.informacionconferenciaactualizada");
        this.informacion = informacion;
    }


    public Informacion getInformacion(){return informacion;}
}
