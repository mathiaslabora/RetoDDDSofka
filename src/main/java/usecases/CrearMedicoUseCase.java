package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.medico.Medico;
import domain.medico.command.CrearMedico;

public class CrearMedicoUseCase extends UseCase<RequestCommand<CrearMedico>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearMedico> input) {
        CrearMedico crearMedico = input.getCommand();

        Medico medico = new Medico(crearMedico.getMedicoId());
        emit().onResponse(new ResponseEvents(medico.getUncommittedChanges()));
    }
}
