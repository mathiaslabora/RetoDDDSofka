package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.grupo.Discusion;
import domain.grupo.command.CrearDiscusion;

public class CrearDiscusionUseCase extends UseCase<RequestCommand<CrearDiscusion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearDiscusion> input) {
        CrearDiscusion crearDiscusion = input.getCommand();

        Discusion discusion = (new Discusion(crearDiscusion.getGrupoId()));
        emit().onResponse(new ResponseEvents(discusion.getUncommittedChanges()));
    }
}
