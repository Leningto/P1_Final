package logico;

import java.util.ArrayList;

public class Universitario extends Persona {
	private String carreraUniv;

	public Universitario(String nombre, String cedula, String telefono, String direccion, boolean estado,
			String nacionalidad, String carreraUniv) {
		super(nombre, cedula, telefono, direccion, estado, nacionalidad);
		this.carreraUniv = carreraUniv;
	}

	public String getCarreraUniv() {
		return carreraUniv;
	}

	public void setCarreraUniv(String carreraUniv) {
		this.carreraUniv = carreraUniv;
	}

	@Override
	public String INTERIOR() {
		
		return carreraUniv;
	}

}
