package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

public class Item {
  private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
}
