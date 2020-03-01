package clases;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Estudiante extends Personal implements java.io.Serializable{

	private Long legajo;
	private ArrayList<Materia> materias_aprobadas = new ArrayList<Materia>();
	private Materia[] ayudante = new Materia[3];
	
	
	
	public Estudiante() {}
	public Estudiante(String apellido, 
			String nombre, 
			Long dni, 
			String direccion, 
			Long telefono, 
			Fecha nacimiento, 
			Double sbasico,
			Long legajo,
			ArrayList<Materia> materias_aprobadas,
			Materia[] ayudante)
	
	{
		super(apellido,nombre,dni,direccion,telefono,nacimiento,sbasico);
		this.setLegajo(legajo);
		this.setMaterias_aprobadas(materias_aprobadas);
		this.setAyudante(ayudante);
	}
	public Estudiante(Long legajo, 
					  ArrayList<Materia> materias_aprobadas, 
					  Materia[] ayudante) 
	{
		this.setLegajo(legajo);
		this.setMaterias_aprobadas(materias_aprobadas);
		this.setAyudante(ayudante);
	}
	
	public Long getLegajo() {
		return legajo;
	}
	public void setLegajo(Long legajo) {
		this.legajo = legajo;
	}
	public Double getPromedio() {
		return this.getPromedio();
	}
	public ArrayList<Materia> getMaterias_aprobadas() {
		return materias_aprobadas;
	}
	public void setMaterias_aprobadas(ArrayList<Materia> materias_aprobadas) {
		this.materias_aprobadas = materias_aprobadas;
	}
	public Materia[] getAyudante() {
		return ayudante;
	}
	public void setAyudante(Materia[] ayudante) {
		this.ayudante = ayudante;
	}

	public Double calcularPromedio() {
		Double red=0.0;
		Integer cont=0;
		for(Materia i:this.materias_aprobadas){
			if(i.getNota() != null) {
				cont++;
				red += i.getNota();
				
			}
		}
		return red / cont;
	}
	@Override
	public Double remunerar() {
		Integer cont = 0 ;
		for(Materia i:ayudante)
			if(i != null) cont++;
		
		return this.getSbasico()*cont;
	}
}
