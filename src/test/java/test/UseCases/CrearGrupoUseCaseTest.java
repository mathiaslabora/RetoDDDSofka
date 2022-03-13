package test.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.generic.Fecha;
import domain.generic.Nombre;
import domain.generic.UsuarioId;
import domain.grupo.Calendario;
import domain.grupo.Discusion;
import domain.grupo.Evento;
import domain.grupo.command.CrearGrupo;
import domain.grupo.event.GrupoCreado;
import domain.grupo.value.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import usecases.CrearGrupoUseCase;

import java.util.Set;

public class CrearGrupoUseCaseTest {

    @Test
    void crearGrupo() {
        //arrange

        Evento evento = new Evento(EventoId.of("evento"), new Fecha(), new Nombre("gaston"), new Direccion("tudir"));

        Discusion discucion = new Discusion(DiscusionId.of("discusion"), new Tematica("cosas"), GrupoId.of("group"));

        GrupoId grupoId = GrupoId.of("456");
        UsuarioId usuarioId = UsuarioId.of("123");

        CrearGrupo crearGrupo = new CrearGrupo(grupoId,Set<usuarioId> , usuarioId);
        //act
        CrearGrupoUseCase usecase = new CrearGrupoUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(crearGrupo))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (GrupoCreado) events.get(0);
        Assertions.assertEquals("Grupo.grupocreado", event.type);
        Assertions.assertEquals("xxxxx", event.aggregateRootId());
        Assertions.assertEquals(evento, event.getEvento());
        Assertions.assertEquals(discucion, event.getDiscucion());
    }
}