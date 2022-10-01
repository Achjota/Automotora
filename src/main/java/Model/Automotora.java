package Model;

import java.util.ArrayList;

public class Automotora {
	private String codigoAutomotora;
	private String codigoPostal;
	private Cliente cliente;
	private ArrayList<Automotora.Automovil> automovil = new ArrayList<Automovil>();

	public String getCodigoAutomotora() {
		return this.codigoAutomotora;
	}

	public void setCodigoAutomotora() {this.codigoPostal=codigoPostal;}

	public String getCodigoPostal() {return this.codigoPostal;}

	public void setCodigoPostal() {this.codigoPostal=codigoPostal;}

	public Automotora(String codigoAutomotora, String codigoPostal) {;}
	public class Automovil {
	}
}