package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class CrearUsuarioUseCase extends UseCase<RequestCommand<CrearUsuario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearUsuario> input) {
        CrearUsuario crearUsuario = input.getCommand();

        Usuario usuario = new Usuario(crearUsuario.getUsuarioId());
        emit().onResponse(new ResponseEvents(usuario.getUncommittedChanges()));
    }
}
