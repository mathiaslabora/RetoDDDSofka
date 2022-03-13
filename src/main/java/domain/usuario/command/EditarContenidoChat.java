package domain.usuario.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Contenido;
import domain.usuario.value.ChatId;

public class EditarContenidoChat extends Command {
    private final ChatId chatId;
    private final Contenido contenido;

    public EditarContenidoChat(ChatId chatId, Contenido contenido) {
        this.chatId = chatId;
        this.contenido = contenido;
    }

    public ChatId getChatId() {
        return chatId;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
