package domain.medico.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.medico.Conferencia;
import domain.medico.Mensaje;
import domain.medico.PublicacionMedica;
import domain.medico.value.Especializacion;
import domain.medico.value.MedicoId;

import java.util.UUID;

public class MedicoCreado extends DomainEvent {
    protected Especializacion especializacion;
    protected Email email;
    protected Nombre nombre;
    protected Mensaje mensaje;
    protected PublicacionMedica publicacionMedica;
    protected Conferencia conferencia;

    public MedicoCreado(MedicoId medicoId,Especializacion especializacion, Email email, Nombre nombre, Mensaje mensaje, PublicacionMedica publicacionMedica, Conferencia conferencia) {
        super("Medico.medicocreado");
        this.especializacion = especializacion;
        this.email = email;
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.publicacionMedica = publicacionMedica;
        this.conferencia = conferencia;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public Email getEmail() {
        return email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public PublicacionMedica getPublicacionMedica() {
        return publicacionMedica;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }
}