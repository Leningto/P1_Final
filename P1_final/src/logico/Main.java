package logico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BolsaLaboral bl=new BolsaLaboral();
		
		Persona per=new Universitario("lenin","123","123","LR",true,"domi","sistema") ;
		Curriculum nuevo=new Curriculum("C-"+bl.getCodCurriculums(), "123","lenin","Masculino","director","espaniol","LR","120","si","parcil");
		
		Vacante vaca=new Vacante("V-"+bl.getCodVacante(),"director" ,"parcil","Universitario", "espaniol","si", "STGO","Masculino");
		Empresa NUEVA=new Empresa("E-"+bl.getCodEmpresa(), "stgomaching","123","papaupa", "Jose Soto");
		
		bl.insertarUnsuario(per);
		bl.insertarCuerriculom(nuevo);
		per.insertarCurriculums(nuevo);
		
		bl.InsertarEmpreza(NUEVA);
		bl.InsertarSolicitudVacante(vaca);
		NUEVA.insertarVacante(vaca);
		
		
		Mach aux= bl.buscarEmpleado(vaca);
		System.out.println(aux.getAux().getNombre());
		
	
	
	}

}
