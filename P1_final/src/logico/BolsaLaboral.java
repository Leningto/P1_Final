package logico;

import java.util.ArrayList;

import javax.crypto.Mac;
import javax.sound.midi.Soundbank;

public class BolsaLaboral {
	private ArrayList<Persona> personas;
	private ArrayList<Empresa> empresas;
	private ArrayList<Curriculum> curriculums;
	private ArrayList<Vacante> vancates;
	private static int CodEmpresa;
	private static int codVacante;
	private static int codCurriculums;

	public BolsaLaboral() {
		super();
		this.personas = new ArrayList<>();
		this.empresas = new ArrayList<>();
		this.curriculums = new ArrayList<>();
		this.vancates = new ArrayList<>();
		this.CodEmpresa = 1;
		this.codCurriculums = 1;
		this.codVacante = 1;
	}
	

	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public static int getCodEmpresa() {
		return CodEmpresa;
	}


	public static void setCodEmpresa(int codEmpresa) {
		CodEmpresa = codEmpresa;
	}


	public static int getCodVacante() {
		return codVacante;
	}


	public static void setCodVacante(int codVacante) {
		BolsaLaboral.codVacante = codVacante;
	}


	public static int getCodCurriculums() {
		return codCurriculums;
	}


	public static void setCodCurriculums(int codCurriculums) {
		BolsaLaboral.codCurriculums = codCurriculums;
	}


	public ArrayList<Persona> getPresonas() {
		return personas;
	}

	public void setPresonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}

	public ArrayList<Curriculum> getCurriculums() {
		return curriculums;
	}

	public void setCurriculums(ArrayList<Curriculum> curriculums) {
		this.curriculums = curriculums;
	}

	public ArrayList<Vacante> getVancates() {
		return vancates;
	}

	public void setVancates(ArrayList<Vacante> vancates) {
		this.vancates = vancates;
	}
	
	
	
	public boolean insertarUnsuario(Persona persona) {
		boolean insertado=false;
		if(persona!=null&& !personaExiste(persona)) {
			personas.add(persona);
			insertado=true;
		}
		return insertado;
	}
	public boolean personaExiste(Persona persona) {
		int i=0;
		boolean Existe=false;
		while(i<personas.size()&&!Existe) {
			if(personas.get(i).getCedula().equalsIgnoreCase(persona.getCedula())) {
				Existe=true;
			}
			i++;
		}
		return Existe;
	}
	
	public boolean InsertarSolicitudPERSONA(Curriculum curri) {
		boolean insertado=false,Existe=false;
		
		if(curri!=null) {
			int i=0;
			while(i<curriculums.size()&&!Existe) {
				if(curriculums.get(i).equals(curri)) {
					Existe=true;
				}
				i++;
			}
			if(Existe==false) {
				curriculums.add(curri);
				insertado=true;
			}
		}
		return insertado;
	}
	
	
	public boolean InsertarEmpreza(Empresa empresa) {
		boolean insertado=false;
		Empresa aux=buscarEmpresa(empresa.getCodigo());
		if(aux==null) {
			empresas.add(empresa);
			insertado=true;
		}
		return insertado;
	}


	private Empresa buscarEmpresa(String codigo) {
		int i=0;
		boolean encontrado=false;
		Empresa aux=null;
		while(i<empresas.size()&&!encontrado) {
			if(empresas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				aux=empresas.get(i);
				encontrado=true;
			}
			i++;
		}
		return aux;
	}
	
	public boolean InsertarSolicitudVacante(Vacante vancante) {
		boolean insertado=false;
		if(vancante!=null) {
			vancates.add(vancante);
			insertado=true;
		}
		return insertado;
	}
	
	
	//mach de empresa a trabajador
	public Mach buscarEmpleado(Vacante vacante){
		Curriculum aux=null;
		Mach nuevo=null;
		Mach ELpapa=null;
		ArrayList<Mach>maches=new ArrayList<>();
		for(Persona persona:personas) {
			if(persona instanceof Obrero) {
				if(vacante.getTipo_empleado().equalsIgnoreCase("brero")) {
					nuevo=persona.buscarCurriculums(vacante);
				}
			}
			if(persona instanceof Tecnico) {
				if(vacante.getTipo_empleado().equalsIgnoreCase("Tecnico")) {
					nuevo=persona.buscarCurriculums(vacante);
				}
			}
			if(persona instanceof Universitario) {
				if(vacante.getTipo_empleado().equalsIgnoreCase("Universitario")) {
					nuevo=persona.buscarCurriculums(vacante);
				}
			}
			
			if(nuevo.getIdice()>0) {
				maches.add(nuevo);
			}
			
			ELpapa=buscarmayorIndiceDeMACHES(maches);
		}
		return ELpapa;
	}


	public Mach buscarmayorIndiceDeMACHES(ArrayList<Mach> maches) {
		// TODO Auto-generated method stub
		Mach aux=null;
		int elpapa=0;
		for(int i=0;i<maches.size();i++) {
			if(maches.get(i).getIdice()>elpapa){
				aux=maches.get(i);
			}
		}
		return aux;
		
	}

}
