package domain.usuario;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Fecha;
import domain.usuario.value.Estado;
import domain.usuario.value.Nota;
import domain.usuario.value.SeguimientoId;

public class Seguimiento extends Entity<SeguimientoId> {
    private final Fecha fecha;
    private final Estado estado;
    private final Nota nota;

    public Seguimiento(SeguimientoId entityId, Fecha fecha, Estado estado, Nota nota) {
        super(entityId);
        this.fecha = fecha;
        this.estado = estado;
        this.nota = nota;
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Estado Estado() {
        return estado;
    }

    public Nota Nota() {
        return nota;
    }
}
