package domain.grupo.value;

import co.com.sofka.domain.generic.Identity;
public class DiscusionId extends Identity {
    private DiscusionId(String id){
        super(id);
    }

    public DiscusionId(){ }

    public static DiscusionId of(String id) {
        return new DiscusionId(id);
    }
}