package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.usuario.value.Nota;
import domain.usuario.value.SeguimientoId;

public class CrearNotaSeguimiento  extends Command {

    private final Nota nota;
    private final SeguimientoId seguimientoId;

    public CrearNotaSeguimiento(Nota nota, SeguimientoId seguimientoId) {
        this.nota = nota;
        this.seguimientoId = seguimientoId;
    }

    public Nota getNota() {
        return nota;
    }

    public SeguimientoId getSeguimientoId() {
        return seguimientoId;
    }
}
