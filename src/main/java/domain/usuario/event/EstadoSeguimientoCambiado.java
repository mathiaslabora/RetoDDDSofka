package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.medico.value.MensajeId;
import domain.usuario.Seguimiento;
import domain.usuario.value.Estado;
import domain.usuario.value.SeguimientoId;

public class EstadoSeguimientoCambiado extends DomainEvent {
    private final SeguimientoId seguimientoId;

    public EstadoSeguimientoCambiado(SeguimientoId seguimientoId){
        super("Seguimiento.estadoseguimientocambiado");
        this.seguimientoId = seguimientoId;

    }

    public SeguimientoId getSeguimientoId() {
        return seguimientoId;
    }
}
