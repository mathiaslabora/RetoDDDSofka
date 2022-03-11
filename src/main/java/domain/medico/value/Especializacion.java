package domain.medico.value;

import co.com.sofka.domain.generic.ValueObject;

public class Especializacion implements ValueObject<String> {
    private final String value;

    public Especializacion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
