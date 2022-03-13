package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.usuario.command.CambiarEstadoSeguimiento;
import domain.usuario.value.Estado;

public class CambiarEstadoSeguimientoUseCase extends UseCase<RequestCommand<CambiarEstadoSeguimiento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarEstadoSeguimiento> input) {
        CambiarEstadoSeguimiento cambiarEstadoSeguimiento = input.getCommand();

        Estado estado = new Estado(cambiarEstadoSeguimiento.getEstado());
        emit().onResponse(new ResponseEvents(usuario.getUncommittedChanges()));
    }
}
