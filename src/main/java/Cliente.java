import Controller.GestionSedeController;

public class Cliente {
	private String nombre;
	private String direccion;
	private int numeroTelefonico;
	private String correo;
	private String rut;
	public GestionSedeController GestionSedeController;

	public String getNombre() {return this.nombre;}

	public void setNombre() {this.nombre=nombre;}

	public String getDireccion() {return this.direccion;}

	public void setDireccion() {this.direccion=direccion;}

	public int getNumeroTelefonico() {return this.numeroTelefonico;}

	public void setNumeroTelefonico() {this.numeroTelefonico=numeroTelefonico;}

	public String getCorreo() {return this.correo;}

	public void setCorreo() {this.correo=correo;}

	public String getRut() {return this.rut;}

	public void setRut() {this.rut=rut;}

	public Cliente(String nombre, String direccion, int numeroTelefonico, String correo, String rut) {;}
}