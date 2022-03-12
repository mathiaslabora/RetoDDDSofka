package domain.usuario.value;

import co.com.sofka.domain.generic.ValueObject;

public class Nota implements ValueObject<String> {
    private final String value;

    public Nota(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
