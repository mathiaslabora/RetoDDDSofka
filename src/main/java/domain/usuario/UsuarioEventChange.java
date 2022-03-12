package domain.usuario;

import co.com.sofka.domain.generic.EventChange;
import domain.medico.Medico;
import domain.medico.event.MedicoCreado;
import domain.usuario.event.UsuarioCreado;

public class UsuarioEventChange extends EventChange {
    public UsuarioEventChange(Usuario usuario){
        apply((UsuarioCreado event) -> {
            usuario.publicacionConsulta = event.getPublicacionConsulta();
            usuario.chat = event.getChat();
            usuario.email = event.getEmail();
            usuario.nombre = event.getNombre();
            usuario.seguimiento = event.getSeguimiento();



        });


    }
}

