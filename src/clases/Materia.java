package clases;

import java.io.Serializable;

public class Materia implements Serializable {
	
	private Double nota;
	
	public Materia() {}
	
	public Materia(Double nota) {
		
		this.nota = nota;
		
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
	
}
