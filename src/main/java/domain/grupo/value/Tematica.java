package domain.grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Tematica implements ValueObject<String> {
    private final String value;

    public Tematica(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
