package domain.medico.value;

import co.com.sofka.domain.generic.ValueObject;

public class Informacion implements ValueObject<String> {
    private final String value;

    public Informacion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
