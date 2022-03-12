package domain.usuario.value;

import co.com.sofka.domain.generic.Identity;

public class ChatId extends Identity {
    private ChatId(String valor){
        super(valor);
    }

    public ChatId(){}
    public static ChatId of(String valor) {
        return new ChatId(valor);
    }
}