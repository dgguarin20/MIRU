package codigoFuente;

import java.sql.Date;

public class Servidor {

	private String nombre;
	private String ip;
	private String modelo;
	private String tipo;
	private Date ultimaConsulta;
	private String sistemaOperativo;
	private String procesador;
	
	private SinGrafica sinGrafico;
	private ConGrafica conGrafico;
	
	public Servidor( String nombre, String ip, String modelo, String tipo, Date ultima, String sistemaOp, String procesador){
		this.nombre = nombre;
		this.ip = ip;
		this.modelo = modelo;
		this.tipo = tipo;
		ultimaConsulta = ultima;
		sistemaOperativo = sistemaOp;
		this.procesador = procesador;
	}
	
	public void agregarGrafico( String nombre, String ejeY, String estado  ){
		conGrafico = new ConGrafica( nombre, ejeY, estado); 
	}
	
}
