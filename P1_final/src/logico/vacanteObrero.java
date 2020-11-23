package logico;

public class vacanteObrero extends Vacante {
	private String Habilidades;

	public vacanteObrero(String codigoSoli, String puesto_trabajo, String tipo_de_empleo, String idioma,
			String licenciaConducir, String direccion, String sexo, String habilidades) {
		super(codigoSoli, puesto_trabajo, tipo_de_empleo, idioma, licenciaConducir, direccion, sexo);
		Habilidades = habilidades;
	}

	public String getHabilidades() {
		return Habilidades;
	}

	public void setHabilidades(String habilidades) {
		Habilidades = habilidades;
	}

}
