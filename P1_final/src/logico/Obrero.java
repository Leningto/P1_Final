package logico;

import java.util.ArrayList;

public class Obrero extends Persona {
	private String Habilidades;/* habilidades : plomero, electricista,carpintero,construcctor */

	
	public Obrero(String nombre, String cedula, String telefono, String direccion, boolean estado, String nacionalidad,
			String habilidades) {
		super(nombre, cedula, telefono, direccion, estado, nacionalidad);
		Habilidades = habilidades;
	}

	public String getHabilidades() {
		return Habilidades;
	}

	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

}
