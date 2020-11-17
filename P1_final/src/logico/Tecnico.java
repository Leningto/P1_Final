package logico;

import java.util.ArrayList;

public class Tecnico extends Persona {
	private String area_desarrollo; /* area en la que se desarrolla */

	

	public Tecnico(String nombre, String cedula, String telefono, String direccion, boolean estado, String nacionalidad,
			String area_desarrollo) {
		super(nombre, cedula, telefono, direccion, estado, nacionalidad);
		this.area_desarrollo = area_desarrollo;
	}

	public String getArea_desarrollo() {
		return area_desarrollo;
	}

	public void setArea_desarrollo(String area_desarrollo) {
		this.area_desarrollo = area_desarrollo;
	}

}
