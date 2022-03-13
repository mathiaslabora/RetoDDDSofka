package domain.medico;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Fecha;
import domain.medico.value.ConferenciaId;
import domain.medico.value.Informacion;

public class Conferencia extends Entity<ConferenciaId> {
    private final Fecha fecha;
    private Informacion informacion;

    public Conferencia(ConferenciaId entityId, Fecha fecha, Informacion informacion) {
        super(entityId);
        this.fecha = fecha;
        this.informacion = informacion;
    }



    public Fecha Fecha() {
        return fecha;
    }

    public Informacion Informacion() {
        return informacion;
    }
}