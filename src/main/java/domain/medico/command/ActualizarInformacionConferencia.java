package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.medico.value.ConferenciaId;
import domain.medico.value.Informacion;

public class ActualizarInformacionConferencia extends Command {
    private final ConferenciaId conferenciaId;
    private final Informacion informacion;

    public ActualizarInformacionConferencia(Informacion informacion, ConferenciaId conferenciaId) {
        this.informacion = informacion;
        this.conferenciaId= conferenciaId;
    }


    public ConferenciaId getConferenciaId(){return conferenciaId;}
    public Informacion getInformacion(){return informacion;}
}
