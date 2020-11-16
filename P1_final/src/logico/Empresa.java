package logico;

import java.util.ArrayList;

public class Empresa {
	private String nombre, telefono, direccion, nombreCEO;
	private ArrayList<Vacante> vacantes;

	public Empresa(String nombre, String telefono, String direccion, String nombreCEO, ArrayList<Vacante> vacantes) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nombreCEO = nombreCEO;
		this.vacantes = vacantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreCEO() {
		return nombreCEO;
	}

	public void setNombreCEO(String nombreCEO) {
		this.nombreCEO = nombreCEO;
	}

	public ArrayList<Vacante> getVacantes() {
		return vacantes;
	}

	public void setVacantes(ArrayList<Vacante> vacantes) {
		this.vacantes = vacantes;
	}

}