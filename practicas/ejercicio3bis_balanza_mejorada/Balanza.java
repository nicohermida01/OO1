package ar.edu.unlp.info.oo1.ejercicio3bis_balanza_mejorada;

import java.util.ArrayList;

public class Balanza {
  private double precioTotal;
	private double pesoTotal;
	private List<Producto> listaProductos;
	
	public Balanza() {
		this.init();
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.listaProductos.size();
	}
	
	public void ponerEnCero() {
		this.init();
	}
	
	public void agregarProducto(Producto producto) {
		this.listaProductos.add(producto);
		this.precioTotal = this.precioTotal + producto.getPrecio();
		this.pesoTotal = this.pesoTotal + producto.getPeso();
	}
	
	public List<Producto> getProductos() {
		return this.listaProductos;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.listaProductos, this.pesoTotal, this.precioTotal);
		
		return ticket;
	}
	
	private void init() {
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.listaProductos = new ArrayList<Producto>();
	}
}
