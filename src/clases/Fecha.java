package clases;

import java.util.Date;

public class Fecha {

	private Integer dia;
	private Integer mes;
	private Integer year;
	
	public Fecha (Integer dia, Integer mes, Integer year) {
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}
	
	
	
	public Integer getDia() {
		return dia;
	}


	public void setDia(Integer dia) {
		this.dia = dia;
	}


	public Integer getMes() {
		return mes;
	}


	public void setMes(Integer mes) {
		this.mes = mes;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.year;
	}
	
}
