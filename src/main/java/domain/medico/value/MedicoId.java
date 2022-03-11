package domain.medico.value;

import co.com.sofka.domain.generic.Identity;

public class MedicoId extends Identity {
    private MedicoId(String id){
        super(id);
    }

    public MedicoId(){ }

    public static MedicoId of(String id) {
        return new MedicoId(id);
    }
}
