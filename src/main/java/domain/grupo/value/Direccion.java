package domain.grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
