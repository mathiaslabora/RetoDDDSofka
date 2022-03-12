package domain.medico.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.Destinatario;

public class DestinatarioDeMensajeCambiado extends DomainEvent {

    public final Destinatario destinatario;

    public DestinatarioDeMensajeCambiado(Destinatario destinatario) {
        super("Mensaje.destinatariomensajecambiado");
        this.destinatario = destinatario;
    }
}
