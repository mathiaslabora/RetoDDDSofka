package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.usuario.value.ChatId;

public class ContenidoChatEditado extends DomainEvent {
    private final ChatId chatId;

    public ContenidoChatEditado(ChatId chatId){
        super("Chat.contenidochateditado");
        this.chatId = chatId;

    }

    public ChatId getChatId() {
        return chatId;
    }
}
