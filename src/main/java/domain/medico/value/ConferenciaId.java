package domain.medico.value;

import co.com.sofka.domain.generic.Identity;

public class ConferenciaId extends Identity {
    private ConferenciaId(String id){
        super(id);
    }

    public ConferenciaId(){ }

    public static ConferenciaId of(String id) {
        return new ConferenciaId(id);
    }
}