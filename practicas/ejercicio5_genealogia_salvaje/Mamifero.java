package ar.edu.unlp.info.oo1.ejercicio5_genealogiaSalvaje;

import java.time.LocalDate;
public class Mamifero {
  private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		this.commonInit();
	}
	
	public Mamifero(String id) {
		this.identificador = id;
		this.commonInit();
	}
	
	private void commonInit() {
		this.fechaNacimiento = LocalDate.now();
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null) {
			return this.madre.getPadre();
		}
		
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null) {
			return this.madre.getMadre();
		}
		
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null) {
			return this.padre.getPadre();
		}
		
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null) {
			return this.padre.getMadre();
		}
		
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return ((this.madre == unMamifero) || 
				(this.padre == unMamifero) || 
				(this.padre != null && this.padre.tieneComoAncestroA(unMamifero)) || 
				(this.madre != null && this.madre.tieneComoAncestroA(unMamifero)));
	}
}
