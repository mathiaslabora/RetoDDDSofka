package domain.grupo;

import co.com.sofka.domain.generic.EventChange;
import domain.grupo.event.GrupoCreado;

import java.util.HashSet;

public class GrupoEventChange extends EventChange {
    public GrupoEventChange(Grupo grupo){
        apply((GrupoCreado event)->{
            grupo.calendario = event.getCalendario();
            grupo.evento = event.getEvento();
            grupo.discucion = event.getDiscucion();
            grupo.usuarioId = new HashSet<>();
        });
    }


}

