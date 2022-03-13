package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.generic.Contenido;
import domain.medico.command.EditarContenidoDeMensaje;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class EditarContenidoDeMensajeUseCase extends UseCase<RequestCommand<EditarContenidoDeMensaje>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarContenidoDeMensaje> input) {
        EditarContenidoDeMensaje editarContenidoDeMensaje = input.getCommand();

        Contenido contenido = new Contenido(editarContenidoDeMensaje.getContenido());
        emit().onResponse(new ResponseEvents(contenido.getUncommittedChanges()));
    }
}
