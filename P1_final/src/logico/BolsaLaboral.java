package logico;

import java.util.ArrayList;

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

	public boolean insertarCleinte(Persona nuevocleinte) {
		boolean insertar = false;
		if (!personaExiste(nuevocleinte.getCedula())) {
			personas.add(nuevocleinte);
			insertar = true;
		}
		return insertar;
	}

	public boolean personaExiste(String cedula) {
		boolean Existe = false;
		int i = 0;
		while (i < personas.size() && !Existe) {
			if (personas.get(i).getCedula().equalsIgnoreCase(cedula)) {
				Existe = true;
			}
			i++;
		}
		return Existe;
	}

	/*
	 * insertar empresa y verificar que ella no exista;
	 */
	public boolean insertarEmpresa(Empresa nuevaEmpresa) {
		boolean insertar = false;
		if (!EmpresaExiste(nuevaEmpresa)) {
			empresas.add(nuevaEmpresa);
			insertar = true;
			CodEmpresa++;
		}
		return insertar;
	}

	public boolean EmpresaExiste(Empresa nuevaEmpresa) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean existe = false;
		while (i < empresas.size() && !existe) {
			if (empresas.get(i).equals(nuevaEmpresa)) {
				existe = true;
			}
			i++;
		}
		return existe;
	}

	/*
	 * insertar curriblums y vereifiar que no existe ese le mismo.
	 */
	public boolean insetarCurriculum(Curriculum curriculum) {
		boolean insertar = false;
		if (!CurriculumExiste(curriculum)) {
			curriculums.add(curriculum);
			insertar = true;
			codCurriculums++;
		}
		return insertar;
	}

	public boolean CurriculumExiste(Curriculum curriculum) {
		// TODO Auto-generated method stub
		boolean Existe = false;
		int i = 0;
		while (i < curriculums.size() && !Existe) {
			if (curriculums.get(i).equals(curriculum)) {
				Existe = true;
			}
			i++;
		}
		return Existe;
	}

	/*
	 * insertar vacante y verificar que no existe otro igual;
	 */
	public boolean insertarVacante(Vacante nuevaVacante) {
		boolean insertar = false;
		if (!VancanteExiste(nuevaVacante)) {
			vancates.add(nuevaVacante);
			insertar = true;
			codVacante++;

		}
		return insertar;
	}

	private boolean VancanteExiste(Vacante nuevaVacante) {
		// TODO Auto-generated method stub
		boolean Existe = false;
		int i = 0;
		while (i < vancates.size() && !Existe) {
			if (vancates.get(i).equals(nuevaVacante)) {
				Existe = true;
			}
			i++;
		}
		return Existe;
	}
	
	
	

}
