package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.grupo.Grupo;
import domain.grupo.command.CrearGrupo;

public class CrearGrupoUseCase extends UseCase<RequestCommand<CrearGrupo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearGrupo> input) {
        CrearGrupo crearGrupo = input.getCommand();

        Grupo grupo = new Grupo(crearGrupo.getGrupoId());
        emit().onResponse(new ResponseEvents(grupo.getUncommittedChanges()));
    }
}
