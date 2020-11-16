package logico;

import java.util.ArrayList;

public class Obrero extends Persona {
	private String Habilidades;/* habilidades : plomero, electricista,carpintero,construcctor */

	public Obrero(ArrayList<Curriculum> curriculum, String nombre, String cedula, String telefono, String direccion,
			String habilidades) {
		super(curriculum, nombre, cedula, telefono, direccion);
		Habilidades = habilidades;
	}

	public String getHabilidades() {
		return Habilidades;
	}

	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

}
