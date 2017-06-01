package fiuba;

public class Notificacion {
	private String cliente;
	private int montoACobrar; // En pesos
	
	public Notificacion(String cliente,int monto){
		this.cliente = cliente;
		this.montoACobrar = monto;
	}
	public Notificacion(){	
		this("Cliente Habitual",500000);
	}
	public int getMonto() {
		return this.montoACobrar;
	}
	public String getCliente() {
		return this.cliente;
	}
}