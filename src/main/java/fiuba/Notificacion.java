package fiuba;

public class Notificacion {
	private Cliente cliente;
	private int montoACobrar; // En pesos
	
	public Notificacion(Cliente cliente,int monto){
		this.cliente = cliente;
		this.montoACobrar = monto;
	}
	public Notificacion(){	
		this(new Cliente("Cliente Habitual"),500000);
	}
	public int getMonto() {
		return this.montoACobrar;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
}