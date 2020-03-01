package clases;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Docente extends Personal implements java.io.Serializable{

	private Long cuil;
	private Integer antiguedad;
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	
	public Docente() {}
	public Docente(String apellido, 
				   String nombre, 
				   Long dni, 
				   String direccion, 
				   Long telefono, 
				   Fecha nacimiento, 
				   Double sbasico,
				   Long cuil,
				   Integer antiguedad,
				   ArrayList<Estudiante> alumnos) 
	{
		super(apellido,nombre,dni,direccion,telefono,nacimiento,sbasico);
		this.setCuil(cuil);
		this.setAntiguedad(antiguedad);
		this.setAlumnos(alumnos);
	}
	public Docente(Long cuil, 
				   Integer antiguedad, 
				   ArrayList<Estudiante> alumnos) {
		this.setCuil(cuil);
		this.setAntiguedad(antiguedad);
		this.setAlumnos(alumnos);
	}
	
	public Long getCuil() {
		return cuil;
	}
	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public ArrayList<Estudiante> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Estudiante> alumnos) {
		this.alumnos = alumnos;
	}
	public ArrayList<Long> getLegajos() {
		ArrayList<Long> Vuelto = new ArrayList<Long>();
		for(Estudiante i:this.alumnos) {
			Vuelto.add(i.getLegajo());
		}
		return Vuelto;
	}
	
	public Double calcularPromedio() {
		Double ret = 0.0;
		Integer cont = 0;
		
		for(Estudiante i:this.alumnos) {
			if(i.getPromedio() != null) {
				cont++;
				ret += i.getPromedio();
			}
		
		}
		
		return ret / cont;
	}
	public Double remunerar() {
		
		Double aumentado;
		switch(this.getAntiguedad()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			aumentado = this.getSbasico() * 0.1; 
			break;
		case 11:
		case 12:
		case 13:
		case 14:
		case 15: 
			aumentado = this.getSbasico() * 0.15; 
			break;
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			aumentado = this.getSbasico() * 0.2; 
			break;
		default: 
			aumentado = this.getSbasico() * 0.25; 
			break;	
		}
		return this.getSbasico() + aumentado;
	}
	
}
