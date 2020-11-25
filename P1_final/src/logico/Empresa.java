package logico;

import java.util.ArrayList;

public class Empresa {
	private String codigo, nombre, telefono, direccion, nombreCEO, RNC;
	private ArrayList<Vacante> vacantes;

	public Empresa(String codigo, String nombre, String telefono, String direccion, String nombreCEO, String RNC) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nombreCEO = nombreCEO;
		this.setRNC(RNC);
		this.vacantes = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	
	
	
	
	public void insertarVacante(Vacante vaca) {
		vacantes.add(vaca);
	}

	public String getRNC() {
		return RNC;
	}

	public void setRNC(String rNC) {
		RNC = rNC;
	}

}
