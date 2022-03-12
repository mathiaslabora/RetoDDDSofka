package domain.usuario.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.generic.Email;
import domain.generic.Nombre;
import domain.usuario.Chat;
import domain.usuario.PublicacionConsulta;
import domain.usuario.Seguimiento;

public class UsuarioCreado extends DomainEvent {

     protected PublicacionConsulta publicacionConsulta;
     protected Chat chat;
     protected Email email;
     protected Seguimiento seguimiento;
     protected Nombre nombre;

     public UsuarioCreado(PublicacionConsulta publicacionConsulta, Chat chat, Email email, Seguimiento seguimiento, Nombre nombre) {
          super("Usuario.usuariocreado");
          this.publicacionConsulta = publicacionConsulta;
          this.chat = chat;
          this.email = email;
          this.seguimiento = seguimiento;
          this.nombre = nombre;
     }

     public PublicacionConsulta getPublicacionConsulta() {
          return publicacionConsulta;
     }

     public Chat getChat() {
          return chat;
     }

     public Email getEmail() {
          return email;
     }

     public Seguimiento getSeguimiento() {
          return seguimiento;
     }

     public Nombre getNombre() {
          return nombre;
     }
}