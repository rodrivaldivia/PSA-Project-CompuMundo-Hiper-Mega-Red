package fiuba;

import java.util.ArrayList;

public class Proyecto {

	private Cliente cliente;
	private ArrayList<Notificacion> lista = new ArrayList<Notificacion>();
	
	public Proyecto(Cliente cliente) {
		this.cliente = cliente;
	}

	public Notificacion agregarNotificacion() {
		return this.agregarNotificacion(500);
	}
	
	public Notificacion agregarNotificacion(int monto) {
		Notificacion notificacion = new Notificacion(this.cliente,monto);
		this.lista.add(notificacion);
		return notificacion;
	}

}
