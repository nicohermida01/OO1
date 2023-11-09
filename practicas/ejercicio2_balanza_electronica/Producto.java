package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
  private double peso;
  private double precioPorKilo;
  private String descripcion;

  public Producto() {
    this.peso = 0;
    this.precioPorKilo = 0;
    this.descripcion = "";
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setPrecioPorKilo(double precioPorKilo) {
    this.precioPorKilo = precioPorKilo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioPorKilo() {
    return this.precioPorKilo;
  }

  public double getPeso() {
    return this.peso;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public double getPrecio() {
    return this.precioPorKilo * this.peso;
  }
}
