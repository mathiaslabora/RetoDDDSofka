package domain.medico.command;

import co.com.sofka.domain.generic.Command;
import domain.generic.Contenido;
import domain.generic.Fecha;
import domain.medico.value.Destinatario;
import domain.medico.value.MensajeId;

public class CrearMensaje extends Command {

    private final MensajeId pedidoId;
    private final Fecha fecha;
    private Contenido contenido;
    private Destinatario destinatario;


    public CrearMensaje(MensajeId pedidoId, Fecha fecha, Contenido contenido, Destinatario destinatario) {
        this.pedidoId = pedidoId;
        this.fecha = fecha;
        this.contenido = contenido;
        this.destinatario = destinatario;
    }

    public MensajeId getPedidoId() {
        return pedidoId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }
}
