package Model;

public class Automovil {
	private String nombre;
	private int año;
	private String color;
	private String marca;
	private double kmRecorrido;
	private double precio;

	public String getNombre() {
		return this.nombre;}

	public void setNombre() {
		throw new UnsupportedOperationException();
	}

	public int getAño() {
		return this.año;
	}

	public void setAño() {
		throw new UnsupportedOperationException();
	}

	public String getColor() {return this.color;}

	public void setColor() {this.color=color;}

	public String getMarca() {return this.marca;}

	public void setMarca() {this.marca=marca;}

	public double getKmRecorrido() {return this.kmRecorrido;}

	public void setKmRecorrido() {this.kmRecorrido=kmRecorrido;}

	public double getPrecio() {return this.precio;}

	public void setPrecio() {this.precio=precio;}

	public Automovil(String nombre, int año, String color, String marca, double kmRecorrido, double precio) {;
	}
}