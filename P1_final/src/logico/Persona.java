package logico;

import java.util.ArrayList;

public abstract class Persona {
	protected ArrayList<Curriculum> curriculum;
	protected String Nombre, Cedula, telefono,direccion,nacionalidad;
	protected boolean estado;//contratado 

	public Persona(String nombre, String cedula, String telefono, String direccion, boolean estado,String nacionalidad) {
		super();
		this.curriculum = new ArrayList<>();
		Nombre = nombre;
		Cedula = cedula;
		this.telefono = telefono;
		this.direccion=direccion;
		this.estado = estado;
		this.nacionalidad=nacionalidad;
	}
	

	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNacionalida() {
		return nacionalidad;
	}


	public void setNacionalida(String nacionalida) {
		this.nacionalidad = nacionalida;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


}
