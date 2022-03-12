package domain.usuario;

import co.com.sofka.domain.generic.Entity;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.generic.UsuarioId;
import domain.usuario.value.ChatId;

public class Chat extends Entity<ChatId> {
    private final Contenido contenido;
    private final Fecha fecha;
    private final UsuarioId usuarioId;

    public Chat(ChatId entityId, Contenido contenido, Fecha fecha, UsuarioId usuarioId) {
        super(entityId);
        this.contenido = contenido;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
    }

    public Contenido Contenido() {
        return contenido;
    }

    public Fecha Fecha() {
        return fecha;
    }

    public UsuarioId UsuarioId() {
        return usuarioId;
    }
}
