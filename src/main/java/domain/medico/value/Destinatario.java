package domain.medico.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.generic.Nombre;
import domain.generic.UsuarioId;

import java.util.Objects;

public class Destinatario implements ValueObject<Destinatario.Props> {
    private final Nombre nombre;
    private final UsuarioId usuarioId;


    public Destinatario(Nombre nombre, UsuarioId usuarioId) {
        this.nombre = Objects.requireNonNull(nombre);
        this.usuarioId = Objects.requireNonNull(usuarioId);
    }

    public Props value() {
        return new Props() {
            @Override
            public Nombre nombre() {
                return nombre;
            }

            @Override
            public UsuarioId usuarioId() {
                return usuarioId;
            }
        };
    }
        public interface Props {
        Nombre nombre();
        UsuarioId usuarioId();
        }






}
