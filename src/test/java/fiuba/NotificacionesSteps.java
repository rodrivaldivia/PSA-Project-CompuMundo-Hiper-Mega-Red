package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class NotificacionesSteps {

    private ListaNotificaciones lista;
    private Proyecto proyecto;
    private Cliente cliente;
	
    @Dado("^ninguna notificación nueva en un proyecto del cliente \"(.*?)\"$")
    public void ninguna_notificación_nueva_en_un_proyecto_del_cliente(String nombre) throws Throwable {
	    this.cliente = new Cliente(nombre);
    	this.lista = new ListaNotificaciones();
	    this.proyecto = new Proyecto(this.cliente);
	}

    @Cuando("^se completan (\\d+) milestones en ese proyecto$")
    public void se_completan_milestones_en_ese_proyecto(int cant) throws Throwable {
    	for(int i=0;i<cant;i++){
        	Notificacion notificacion = proyecto.agregarNotificacion();
        	this.lista.agregar(notificacion);
        }
	}

    @Entonces("^tengo (\\d+) notificaciones en ese proyecto$")
    public void tengo_notificaciones_en_ese_proyecto(int cant) throws Throwable {
		assertEquals(cant, this.lista.cantidad());
	}
	
    @Cuando("^se completa un milestone de (\\d+)\\$$")
    public void se_completa_un_milestone_de_$(int monto) throws Throwable {
	    Notificacion notificacion = this.proyecto.agregarNotificacion(monto);
		this.lista.agregar(notificacion);
	}

	@Entonces("^tengo una notificación cuyo cliente es \"(.*?)\"$")
	public void tengo_una_notificación_cuyo_cliente_es(String cliente) throws Throwable {
		Notificacion notificacion = this.lista.ultimaNotificacion();
    	assertEquals(cliente, notificacion.getCliente().getNombre());
	}

	@Entonces("^tengo una notificación cuyo monto es (\\d+)\\$$")
	public void tengo_una_notificación_cuyo_monto_es_$(int monto) throws Throwable {
		Notificacion notificacion = this.lista.ultimaNotificacion();
    	assertEquals(monto, notificacion.getMonto());
	}

}
