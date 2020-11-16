package logico;

import java.util.ArrayList;

public class Universitario extends Persona {
	private String carreraUniv;

	public Universitario(ArrayList<Curriculum> curriculum, String nombre, String cedula, String telefono,
			String direccion, String carreraUniv) {
		super(curriculum, nombre, cedula, telefono, direccion);
		this.carreraUniv = carreraUniv;
	}

	public String getCarreraUniv() {
		return carreraUniv;
	}

	public void setCarreraUniv(String carreraUniv) {
		this.carreraUniv = carreraUniv;
	}

}
