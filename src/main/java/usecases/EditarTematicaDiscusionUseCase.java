package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.grupo.command.EditarTematicaDiscusion;
import domain.grupo.value.Tematica;

public class EditarTematicaDiscusionUseCase extends UseCase<RequestCommand<EditarTematicaDiscusion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarTematicaDiscusion> input) {
        EditarTematicaDiscusion editarTematicaDiscusion = input.getCommand();

        Tematica tematica = new Tematica(editarTematicaDiscusion.getTematica());
        emit().onResponse(new ResponseEvents(tematica.getUncommittedChanges()));
    }
}
