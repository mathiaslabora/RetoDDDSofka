package domain.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class SeguimientoId extends Identity {
    private SeguimientoId(String valor){
        super(valor);
    }

    public SeguimientoId(){}
    public static SeguimientoId of(String valor) {
        return new SeguimientoId(valor);
    }
}