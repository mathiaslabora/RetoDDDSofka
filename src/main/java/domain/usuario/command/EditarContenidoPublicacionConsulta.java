package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Contenido;
import domain.usuario.value.PublicacionConsultaId;

public class EditarContenidoPublicacionConsulta extends Command {

    private final PublicacionConsultaId publicacionConsultaId;
    private final Contenido contenido;

    public EditarContenidoPublicacionConsulta(PublicacionConsultaId publicacionConsultaId, Contenido contenido) {
        this.publicacionConsultaId = publicacionConsultaId;
        this.contenido = contenido;
    }

    public PublicacionConsultaId getPublicacionConsultaId() {
        return publicacionConsultaId;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
