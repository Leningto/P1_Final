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
	

	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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
	public void insertarCurriculums(Curriculum curri) {
		curriculum.add(curri);
	}

	public Mach buscarCurriculums(Vacante vacante) {
		Mach aux=null;
		Curriculum aux1=null;
		int indiceMayor=0;
		int indiceMenor=0;
		int i =0;
		System.out.println(curriculum.size());
		while(i<curriculum.size()) {
			indiceMenor=0;
			System.out.println("dentro del bucle");
			if(curriculum.get(i).getTipo_empleo().equalsIgnoreCase(vacante.getTipo_de_empleo())) {
				indiceMenor++;
				System.out.println("aqui");
				if(curriculum.get(i).getSexo().equalsIgnoreCase(vacante.getSexo())) {
					indiceMenor++;
					System.out.println("aqui");
				}
				if(curriculum.get(i).getIdioma().equalsIgnoreCase(vacante.getIdioma())) {
					indiceMenor++;
					System.out.println("aqui");
				}
				if(curriculum.get(i).getLicencia_conducir().equalsIgnoreCase(vacante.getLicenciaConducir())) {
					indiceMenor++;
					System.out.println("aqui");
				}
			}
			if(indiceMenor>indiceMayor) {
				aux1=curriculum.get(i);
				indiceMayor=indiceMenor;
			}
			i++;
		}
		aux=new Mach(aux1,indiceMayor);
		return aux;
	}

}
