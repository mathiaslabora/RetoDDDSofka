package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.medico.value.MedicoId;

public class CrearMedico extends Command {

    private final MedicoId medicoId;
    private final Nombre nombre;
    private final Email email;

    public CrearMedico(MedicoId medicoId, Nombre nombre, Email email) {
        this.medicoId = medicoId;
        this.nombre = nombre;
        this.email = email;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
