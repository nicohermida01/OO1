package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
  private int cantidadDeProductos;
  private double precioTotal;
  private double pesoTotal;

  public Balanza() {
    init();
  }

  public double getPesoTotal() {
    return this.pesoTotal;
  }

  public double getPrecioTotal() {
    return this.precioTotal;
  }

  public int getCantidadDeProductos() {
    return this.cantidadDeProductos;
  }

  public void ponerEnCero() {
    init();
  }

  public void agregarProducto(Producto producto) {
    this.cantidadDeProductos++;
    this.precioTotal = this.precioTotal + producto.getPrecio();
    this.pesoTotal = this.pesoTotal + producto.getPeso();
  }

  public Ticket emitirTicket() {
    Ticket ticket = new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);

    return ticket;
  }

  private void init() {
    this.cantidadDeProductos = 0;
    this.precioTotal = 0;
    this.pesoTotal = 0;
  }
}
