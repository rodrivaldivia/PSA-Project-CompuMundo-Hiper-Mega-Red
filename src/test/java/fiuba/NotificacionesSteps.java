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
	
	@Dado("^ninguna notificación nueva$")
	public void ninguna_notificación_nueva() throws Throwable {
	    this.lista = new ListaNotificaciones();
	}

	@Cuando("^se completan (\\d+) milestones$")
	public void se_completan_milestones(int cant) throws Throwable {
		for(int i=0;i<cant;i++){
        	Notificacion notificacion = new Notificacion();
        	this.lista.agregar(notificacion);
        }
	}

	@Entonces("^tengo (\\d+) notificación$")
	public void tengo_notificación(int cant) throws Throwable {
		assertEquals(cant, this.lista.cantidad());
	}
	
	@Cuando("^se completa un milestone de (\\d+)\\$ y del cliente \"(.*?)\"$")
	public void se_completa_un_milestone_de_$_y_del_cliente(int monto, String cliente) throws Throwable {
	    Notificacion notificacion = new Notificacion(cliente,monto);
		this.lista.agregar(notificacion);
	}

	@Entonces("^tengo una notificación cuyo cliente es \"(.*?)\"$")
	public void tengo_una_notificación_cuyo_cliente_es(String cliente) throws Throwable {
		Notificacion notificacion = this.lista.ultimaNotificacion();
    	assertEquals(cliente, notificacion.getCliente());
	}

	@Entonces("^tengo una notificación cuyo monto es (\\d+)\\$$")
	public void tengo_una_notificación_cuyo_monto_es_$(int monto) throws Throwable {
		Notificacion notificacion = this.lista.ultimaNotificacion();
    	assertEquals(monto, notificacion.getMonto());
	}

}
