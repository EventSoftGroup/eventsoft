package es.fdi.eventsoft.Negocio.Comandos.Imp.Comandos_Mensajes;
import es.fdi.eventsoft.Negocio.Comandos.Comando;
import es.fdi.eventsoft.Negocio.Comandos.Contexto;
import es.fdi.eventsoft.Negocio.Comandos.EventosNegocio;
import es.fdi.eventsoft.Negocio.Entidades.Mensaje;
import es.fdi.eventsoft.Negocio.ServiciosAplicacion.Factoria_ServiciosAplicacion.FactoriaSA;

/**
 * Created by Rodrigo de Miguel on 09/05/2017.
 */
public class ComandoCountMensajes implements Comando {

    public Contexto execute(Object datos){
        return new Contexto(EventosNegocio.COUNT_MENSAJES, FactoriaSA.getInstance().crearSAMensajes().totalMensajes());
    }

}
