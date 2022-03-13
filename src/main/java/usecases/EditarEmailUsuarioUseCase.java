package usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.generic.Email;
import domain.usuario.Usuario;
import domain.usuario.command.EditarEmailUsuario;

public class EditarEmailUsuarioUseCase extends UseCase<RequestCommand<EditarEmailUsuario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarEmailUsuario> input) {
        EditarEmailUsuario editarEmailUsuario = input.getCommand();

        Email email = new Email(editarEmailUsuario.getEmail());

        emit().onResponse(new ResponseEvents(email.getUncommittedChanges()));
    }
}
