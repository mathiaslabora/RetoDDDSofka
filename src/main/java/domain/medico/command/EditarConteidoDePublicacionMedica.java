package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Contenido;
import domain.medico.value.PublicacionMedicaId;

public class EditarConteidoDePublicacionMedica extends Command {

    private final PublicacionMedicaId publicacionMedicaId;
    private final Contenido contenido;

    public EditarConteidoDePublicacionMedica(PublicacionMedicaId publicacionMedicaId, Contenido contenido) {
        this.publicacionMedicaId = publicacionMedicaId;
        this.contenido = contenido;
    }

    public PublicacionMedicaId getPublicacionMedicaId() {
        return publicacionMedicaId;
    }

    public Contenido getContenido() {
        return contenido;
    }
}