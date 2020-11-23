package logico;

public class vacanteTecnico extends Vacante {
	private String area_desarrollo;

	public vacanteTecnico(String codigoSoli, String puesto_trabajo, String tipo_de_empleo, String idioma,
			String licenciaConducir, String direccion, String sexo, String area_desarrollo) {
		super(codigoSoli, puesto_trabajo, tipo_de_empleo, idioma, licenciaConducir, direccion, sexo);
		this.area_desarrollo = area_desarrollo;
	}

	public String getArea_desarrollo() {
		return area_desarrollo;
	}

	public void setArea_desarrollo(String area_desarrollo) {
		this.area_desarrollo = area_desarrollo;
	}

}
