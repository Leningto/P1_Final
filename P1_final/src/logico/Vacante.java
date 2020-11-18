package logico;

public class Vacante {
	private String codigoSoli;
	private String Puesto_trabajo;
	private String tipo_de_empleo, tipo_empleado;// tipo_empleado {universitario, tecnico, obrero}
	private String idioma;
	private String licenciaConducir, direccion, Sexo;

	public Vacante(String codigoSoli, String puesto_trabajo, String tipo_de_empleo, String tipo_empleado, String idioma,
			String licenciaConducir, String direccion, String sexo) {
		super();
		this.codigoSoli = codigoSoli;
		Puesto_trabajo = puesto_trabajo;
		this.tipo_de_empleo = tipo_de_empleo;
		this.tipo_empleado = tipo_empleado;
		this.idioma = idioma;
		this.licenciaConducir = licenciaConducir;
		this.direccion = direccion;
		Sexo = sexo;
	}

	public String getCodigoSoli() {
		return codigoSoli;
	}

	public void setCodigoSoli(String codigoSoli) {
		this.codigoSoli = codigoSoli;
	}

	public String getPuesto_trabajo() {
		return Puesto_trabajo;
	}

	public void setPuesto_trabajo(String puesto_trabajo) {
		Puesto_trabajo = puesto_trabajo;
	}

	public String getTipo_de_empleo() {
		return tipo_de_empleo;
	}

	public void setTipo_de_empleo(String tipo_de_empleo) {
		this.tipo_de_empleo = tipo_de_empleo;
	}

	public String getTipo_empleado() {
		return tipo_empleado;
	}

	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getLicenciaConducir() {
		return licenciaConducir;
	}

	public void setLicenciaConducir(String licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

}
