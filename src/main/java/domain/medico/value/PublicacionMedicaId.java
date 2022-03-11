package domain.medico.value;

import co.com.sofka.domain.generic.Identity;

public class PublicacionMedicaId extends Identity {
    private PublicacionMedicaId(String id){
        super(id);
    }

    public PublicacionMedicaId(){ }

    public static PublicacionMedicaId of(String id) {
        return new PublicacionMedicaId(id);
    }
}