package codigoFuente;

public class SinGrafica {

	private String nombre;
	private String estado;
	public final static String VIGENTE="VIGENTE";
	public final static String NO_VIGENTE="NO_VIGENTE";
	
	public SinGrafica(String nombre, String estado){
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public String darEstado(){
		return estado;
	}
}
