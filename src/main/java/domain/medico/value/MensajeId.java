package domain.medico.value;

import co.com.sofka.domain.generic.Identity;

public class MensajeId extends Identity {
    private MensajeId(String id){
        super(id);
    }

    public MensajeId(){ }

    public static MensajeId of(String id) {
        return new MensajeId(id);
    }
}
