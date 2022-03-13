package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.medico.Mensaje;
import domain.medico.command.CrearMensaje;
import domain.usuario.Usuario;
import domain.usuario.command.CrearUsuario;

public class CrearMensajeUseCase extends UseCase<RequestCommand<CrearMensaje>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearMensaje> input) {
        CrearMensaje crearMensaje = input.getCommand();

        Mensaje mensaje = new Mensaje(crearMensaje.getMensajeId());
        emit().onResponse(new ResponseEvents(mensaje.getUncommittedChanges()));
    }
}
