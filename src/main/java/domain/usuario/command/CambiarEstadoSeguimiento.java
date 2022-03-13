package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.usuario.value.Estado;
import domain.usuario.value.SeguimientoId;

public class CambiarEstadoSeguimiento  extends Command {

    private final SeguimientoId seguimientoId;
    private final Estado estado;

    public CambiarEstadoSeguimiento(SeguimientoId seguimientoId, Estado estado) {
        this.seguimientoId = seguimientoId;
        this.estado = estado;
    }

    public SeguimientoId getSeguimientoId() {
        return seguimientoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
