package fiuba;

import java.util.ArrayList;

public class ListaNotificaciones {
	private ArrayList<Notificacion> lista;
	
	public ListaNotificaciones(){
		this.lista = new ArrayList<Notificacion>();
	}

	public void agregar(Notificacion notificacion) {
		this.lista.add(notificacion);
	}

	public int cantidad() {
		return this.lista.size();
	}

	public Notificacion ultimaNotificacion() {
		return this.lista.get(this.lista.size() - 1);
	}
}
