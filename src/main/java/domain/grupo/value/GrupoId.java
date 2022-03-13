package domain.grupo.value;

import co.com.sofka.domain.generic.Identity;
import domain.medico.value.ConferenciaId;

public class GrupoId extends Identity {
    private GrupoId(String id){
        super(id);
    }

    public GrupoId(){ }

    public static GrupoId of(String id) {
        return new GrupoId(id);
    }
}