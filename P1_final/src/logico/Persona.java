package logico;

import java.util.ArrayList;

public abstract class Persona {
	protected ArrayList<Curriculum> curriculum;
	protected String Nombre, Cedula, telefono, direccion;;

	public Persona(ArrayList<Curriculum> curriculum, String nombre, String cedula, String telefono, String direccion) {
		super();
		this.curriculum = curriculum;
		this.Nombre = nombre;
		this.Cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
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

	public ArrayList<Curriculum> getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(ArrayList<Curriculum> curriculum) {
		this.curriculum = curriculum;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

}
