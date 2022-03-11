package domain.medico;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.medico.value.PublicacionMedicaId;

public class PublicacionMedica  extends Entity<PublicacionMedicaId> {
    private final Fecha fecha;
    private Contenido contenido;


    public PublicacionMedica(PublicacionMedicaId entityId, Fecha fecha, Contenido contenido) {
        super(entityId);
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public void editarContenido(String contenido){
        this.contenido = new Contenido(contenido);
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Contenido Contenido() {
        return contenido;
    }
}
