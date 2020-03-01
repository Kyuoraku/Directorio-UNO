package clases;
import java.io.Serializable;

public abstract class Personal implements Serializable{

	private String apellido;
	private String nombre;
	private Long dni;
	private String direccion;
	private Long telefono;
	private Fecha nacimiento;
	private Double promedio = this.calcularPromedio();
	private Double sbasico;
	
	public Personal() {}
	public Personal(String apellido, 
					String nombre, 
					Long dni, 
					String direccion, 
					Long telefono, 
					Fecha nacimiento, 
					Double sbasico) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDni(dni);
		this.setDireccion(direccion);
		this.setTelefono(telefono);
		this.setNacimiento(nacimiento);
		this.setSbasico(sbasico);
	}
	public Personal(String apellido, String nombre, Double sbasico) {
		
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Double getSbasico() {
		return sbasico;
	}
	public void setSbasico(Double sbasico) {
		this.sbasico = sbasico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public Fecha getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}

	public abstract Double calcularPromedio();
	public abstract Double remunerar();
	
	
}
