package domain.grupo;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Fecha;
import domain.generic.Nombre;
import domain.grupo.value.Direccion;
import domain.grupo.value.EventoId;

public class Evento  extends Entity<EventoId> {
    private final Fecha fecha;
    private final Nombre nombre;
    private final Direccion direccion;

    public Evento(EventoId entityId, Fecha fecha, Nombre nombre, Direccion direccion) {
        super(entityId);
        this.fecha = fecha;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Direccion Direccion() {
        return direccion;
    }
}
