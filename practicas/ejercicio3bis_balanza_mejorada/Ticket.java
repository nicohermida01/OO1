package ar.edu.unlp.info.oo1.ejercicio3bis_balanza_mejorada;

import java.time.LocalDate;

public class Ticket {
  private LocalDate fecha;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> listaProductos;
	
	public Ticket(List<Producto> listaProductos, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
		this.listaProductos = listaProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
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
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public List<Producto> getProductos() {
		return this.listaProductos;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
}
