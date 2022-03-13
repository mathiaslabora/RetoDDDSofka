package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.grupo.command.EditarDireccionEvento;
import domain.grupo.value.Direccion;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class EditarDireccionEventoUseCase extends UseCase<RequestCommand<EditarDireccionEvento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarDireccionEvento> input) {
        EditarDireccionEvento editarDireccionEvento = input.getCommand();

        Direccion direccion = new Direccion(editarDireccionEvento.getDireccion());
        emit().onResponse(new ResponseEvents(direccion.getUncommittedChanges()));
    }
}
