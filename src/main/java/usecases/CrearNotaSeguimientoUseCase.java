package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.usuario.Usuario;
import domain.usuario.command.CrearNotaSeguimiento;
import domain.usuario.command.CrearUsuario;
import domain.usuario.value.Nota;

public class CrearNotaSeguimientoUseCase extends UseCase<RequestCommand<CrearNotaSeguimiento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearNotaSeguimiento> input) {
        CrearNotaSeguimiento crearNotaSeguimiento = input.getCommand();

        Nota nota = new Nota(crearNotaSeguimiento.getNota());
        emit().onResponse(new ResponseEvents(nota.getUncommittedChanges()));
    }
}