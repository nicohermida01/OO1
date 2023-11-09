package ar.edu.unlp.info.oo1.ejercicio6_redDeAlumbrado;

import java.util.ArrayList;

public class Farola {
  private boolean on;
	private List<Farola> neighbors;

	public Farola() {
		this.on = false;
		this.neighbors = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors() {
		return this.neighbors;
	}
	
	public void turnOn() {
		if (!this.on) {
			this.on = true;
			for(Farola farola: this.neighbors) {
				farola.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if (this.on) {
			this.on = false;
			for(Farola farola: this.neighbors) {
				farola.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return this.on;
	}
}
