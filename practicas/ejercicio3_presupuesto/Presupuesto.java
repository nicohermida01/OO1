package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

import java.time.LocalDate;

public class Presupuesto {
  private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return this.items.stream()
			.mapToDouble(item -> item.costo())
			.sum();
	}
}
