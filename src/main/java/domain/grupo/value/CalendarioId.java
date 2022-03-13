package domain.grupo.value;

import co.com.sofka.domain.generic.Identity;

public class CalendarioId extends Identity {
    private CalendarioId(String id){
        super(id);
    }

    public CalendarioId(){ }

    public static CalendarioId of(String id) {
        return new CalendarioId(id);
    }
}