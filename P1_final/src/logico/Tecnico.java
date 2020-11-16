package logico;

import java.util.ArrayList;

public class Tecnico extends Persona {
	private String area_desarrollo; /* area en la que se desarrolla */

	public Tecnico(ArrayList<Curriculum> curriculum, String nombre, String cedula, String telefono, String direccion,
			String area_desarrollo) {
		super(curriculum, nombre, cedula, telefono, direccion);
		this.area_desarrollo = area_desarrollo;
	}

	public String getArea_desarrollo() {
		return area_desarrollo;
	}

	public void setArea_desarrollo(String area_desarrollo) {
		this.area_desarrollo = area_desarrollo;
	}

}
