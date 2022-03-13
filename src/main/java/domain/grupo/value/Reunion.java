package domain.grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Reunion implements ValueObject<String> {
    private final String value;

    public Reunion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
