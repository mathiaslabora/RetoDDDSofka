package domain.usuario;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.usuario.value.PublicacionConsultaId;

public class PublicacionConsulta extends Entity<PublicacionConsultaId> {
    private final Fecha fecha;
    private Contenido contenido;


    public PublicacionConsulta(PublicacionConsultaId entityId, Fecha fecha, Contenido contenido) {
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
