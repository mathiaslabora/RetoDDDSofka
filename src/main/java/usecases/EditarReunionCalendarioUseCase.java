package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.grupo.command.EditarReunionCalendario;
import domain.grupo.value.Reunion;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class EditarReunionCalendarioUseCase extends UseCase<RequestCommand<EditarReunionCalendario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarReunionCalendario> input) {
        EditarReunionCalendario editarReunionCalendario = input.getCommand();

        Reunion reunion= new Reunion(editarReunionCalendario.getReunion());
        emit().onResponse(new ResponseEvents(reunion.getUncommittedChanges()));
    }
}
