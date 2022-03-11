package domain.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha() {
        this(new Date());
    }

    public Fecha(Date date) {
        //TODO: Faltan validaciones
        this.value = date;
    }

    @Override
    public Date value() {
        return value;
    }
}
