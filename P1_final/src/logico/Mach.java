package logico;

public class Mach {
	private Curriculum aux;
	private int idice;
	private String lol;

	public Mach(Curriculum aux, int idice) {
		super();
		this.aux = aux;
		this.idice = idice;
	}

	public Curriculum getAux() {
		return aux;
	}

	public void setAux(Curriculum aux) {
		this.aux = aux;
	}

	public int getIdice() {
		return idice;
	}

	public void setIdice(int idice) {
		this.idice = idice;
	}

}
