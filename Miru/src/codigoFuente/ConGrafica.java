package codigoFuente;

public class ConGrafica {
	
	private String nombre;
	private String ejeY;
	private String estado; // 
	public final static String NO_FUNCIONA="NO_FUNCIONA";
	public final static String FUNCIONA="OK";
	public final static String ADVERTENCIA="ADVERTENCIA";

	public ConGrafica(String nombre, String ejeY, String estado) {
		this.nombre = nombre;
		this.ejeY = ejeY;
		this.estado = estado;
	}	
	
	public String darestado(){
		return estado;
	}
}
