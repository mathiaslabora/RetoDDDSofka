package domain.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class PublicacionConsultaId extends Identity {
    private PublicacionConsultaId(String id){
        super(id);
    }

    public PublicacionConsultaId(){ }

    public static PublicacionConsultaId of(String id) {
        return new PublicacionConsultaId(id);
    }
}