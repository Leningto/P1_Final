package logico;

public class Curriculum {// =solicitud;
	private String codigoSolicitud;
	private String cedula;
	private String nombre;
	private String Sexo, Puesto_de_trajo, idioma, direccion, sueldo_ideal, licencia_conducir, Tipo_empleo;

	public Curriculum(String codigoSolicitud, String cedula, String nombre, String sexo, String puesto_de_trajo,
			String idioma, String direccion, String sueldo_ideal, String licencia_conducir, String tipo_empleo) {
		super();
		this.codigoSolicitud = codigoSolicitud;
		this.cedula = cedula;
		this.nombre = nombre;
		Sexo = sexo;
		Puesto_de_trajo = puesto_de_trajo;
		this.idioma = idioma;
		this.direccion = direccion;
		this.sueldo_ideal = sueldo_ideal;
		this.licencia_conducir = licencia_conducir;
		Tipo_empleo = tipo_empleo;
	}

	public String getCodigoSolicitud() {
		return codigoSolicitud;
	}

	public void setCodigoSolicitud(String codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getPuesto_de_trajo() {
		return Puesto_de_trajo;
	}

	public void setPuesto_de_trajo(String puesto_de_trajo) {
		Puesto_de_trajo = puesto_de_trajo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSueldo_ideal() {
		return sueldo_ideal;
	}

	public void setSueldo_ideal(String sueldo_ideal) {
		this.sueldo_ideal = sueldo_ideal;
	}

	public String getLicencia_conducir() {
		return licencia_conducir;
	}

	public void setLicencia_conducir(String licencia_conducir) {
		this.licencia_conducir = licencia_conducir;
	}

	public String getTipo_empleo() {
		return Tipo_empleo;
	}

	public void setTipo_empleo(String tipo_empleo) {
		Tipo_empleo = tipo_empleo;
	}

}

/*-String codigoSolicitud;
-String cedula;
String telefono;
-String Puesto_trabajo;
-String tipo_Empleo;
-String idioma;
-float Sueldo_ideal;
-String licenciaConducir;
String Direccion;
-String Sexo;

}*/
