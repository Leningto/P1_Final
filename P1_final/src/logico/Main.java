package logico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BolsaLaboral bl = new BolsaLaboral();

		Persona per2 = new Universitario("angel", "1234", "1234", "STGO", true, "domi", "sistema");
		Curriculum crru2 = new Curriculum("C-" + bl.getCodCurriculums(), "1234", "angel", "masculino", "director",
				"espaniol", "LR", "120", "si", "parcial");

		Persona per = new Tecnico("lenin", "123", "123", "LR", true, "domi", "maquina");
		Curriculum nuevo = new Curriculum("C-" + bl.getCodCurriculums(), "123", "lenin", "Masculino", "director",
				"espaniol", "LR", "120", "si", "parcial");

		Vacante vaca = new vancanteUniversitario("V-" + bl.getCodVacante(), "director", "parcial", "espaniol", "si",
				"LR", "masculino", "sistema");
		Empresa NUEVA = new Empresa("E-" + bl.getCodEmpresa(), "stgomaching", "123", "papaupa", "Jose Soto");
		Vacante vac = new vacanteTecnico("V-" + bl.getCodVacante(), "director", "parcial", "espaniol", "si", "LR",
				"Masculino", "maquina");

		bl.insertarUnsuario(per);
		bl.insertarCuerriculom(nuevo);
		per.insertarCurriculums(nuevo);

		bl.insertarUnsuario(per2);
		bl.insertarCuerriculom(crru2);
		per2.insertarCurriculums(crru2);

		bl.InsertarEmpreza(NUEVA);
		bl.InsertarSolicitudVacante(vac);
		bl.InsertarSolicitudVacante(vaca);
		NUEVA.insertarVacante(vaca);
		NUEVA.insertarVacante(vac);

		System.out.println(bl.getCodCurriculums());
		Mach aux = bl.buscarEmpleado(vac);
		System.out.println(aux.getAux().getNombre()+":"+aux.getIdice());

	}

}
