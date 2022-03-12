package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.medico.value.Especializacion;

public class EditarEspecializacionMedico extends Command {

    private final Especializacion especializacion;

    public EditarEspecializacionMedico(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }


}
