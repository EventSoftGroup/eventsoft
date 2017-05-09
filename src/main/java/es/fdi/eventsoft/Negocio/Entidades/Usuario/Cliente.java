package es.fdi.eventsoft.Negocio.Entidades.Usuario;

import es.fdi.eventsoft.Negocio.Entidades.Evento;
import es.fdi.eventsoft.Negocio.Entidades.Mensaje;
import es.fdi.eventsoft.Negocio.Entidades.Valoracion;

import java.util.List;

public class Cliente extends Usuario {
    private String nombre;
    private String apellidos;
    private List<Valoracion> valoraciones;
    private List<Evento> eventos;

    public Cliente() {
        super();
        this.nombre = "";
        this.apellidos = "";
        this.valoraciones = null;
        this.eventos = null;
    }

    public Cliente(String nombre, String apellidos, List<Valoracion> valoraciones, List<Evento> eventos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.valoraciones = valoraciones;
        this.eventos = eventos;
    }

    public Cliente(Long id, String mail, String password, String direccion, String localidad, String provincia, String telefono, String codigoPostal, EstadosUsuario estado, List<Mensaje> mensajes, String nombre, String apellidos, List<Valoracion> valoraciones, List<Evento> eventos) {
        super(id, mail, password, direccion, localidad, provincia, telefono, codigoPostal, estado, mensajes);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.valoraciones = valoraciones;
        this.eventos = eventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(List<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {

        return super.toString() + System.getProperty("line.separator") + "    Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", valoraciones=" + valoraciones +
                ", eventos=" + eventos +
                '}';
    }
}