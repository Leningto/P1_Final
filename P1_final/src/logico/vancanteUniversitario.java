package logico;

public class vancanteUniversitario extends Vacante {
	private String carreraUniv;
	private String lol;

	public vancanteUniversitario(String codigoSoli, String puesto_trabajo, String tipo_de_empleo, String idioma,
			String licenciaConducir, String direccion, String sexo, String carreraUniv) {
		super(codigoSoli, puesto_trabajo, tipo_de_empleo, idioma, licenciaConducir, direccion, sexo);
		this.carreraUniv = carreraUniv;
	}

	public String getCarreraUniv() {
		return carreraUniv;
	}

	public void setCarreraUniv(String carreraUniv) {
		this.carreraUniv = carreraUniv;
	}

}
