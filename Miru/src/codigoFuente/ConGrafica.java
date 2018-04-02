package codigoFuente;

public class ConGrafica {
	
	private String nombre;
	private String ejeY;
	private String estado; // 
	public final static String NO_FUNCIONA="rip";
	public final static String FUNCIONA="ok";
	public final static String ADVERTENCIA="advertencia";

	public ConGrafica(String nombre, String ejeY, String estado) {
		this.nombre = nombre;
		this.ejeY = ejeY;
		this.estado = estado;
	}	
	
	public String darestado(){
		return estado;
	}
}
