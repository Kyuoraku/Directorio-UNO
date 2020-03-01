@Deprecated
public enum MESES {

	ENERO(1),
	FEBRERO(2),
	MARZO(3),
	ABRIL(4),
	MAYO(5),
	JUNIO(6),
	JULIO(7),
	AGOSTO(8),
	SEPTIEMBRE(9),
	OCTUBRE(10),
	NOVIEMBRE(11),
	DICIEMBRE(12);
	
	private Integer representacion;
	
	private MESES(Integer representacion) {
		this.representacion = representacion;
	}
	
	private Integer getRep(MESES mes) {
		return this.representacion;
	}
}
