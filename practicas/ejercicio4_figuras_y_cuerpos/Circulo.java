package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Circulo {
  private double diametro;
	private double radio;

	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double valor) {
		this.radio = valor;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}
}
