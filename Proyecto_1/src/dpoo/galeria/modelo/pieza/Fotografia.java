package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Fotografia extends Pieza {

	private String resolucionFoto;
	private String plano;
	private String relacionAspecto;
	private String formato;
	private String generoFotografico;
	private String tecnica;
	
	
	public Fotografia(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, Date fechaEntrega, 
			int iD, int iDPropietario, List<String> detallesAdicionales, String resolucionFoto, String plano, String relacionAspecto, 
			String formato, String generoFotografico, String tecnica) 
	{
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, iD, iDPropietario, detallesAdicionales);
		this.resolucionFoto = resolucionFoto;
		this.plano = plano;
		this.relacionAspecto = relacionAspecto;
		this.formato = formato;
		this.generoFotografico = generoFotografico;
		this.tecnica = tecnica;
	}


	/**
	 * @return the resolucionFoto
	 */
	public String getResolucionFoto() {
		return resolucionFoto;
	}


	/**
	 * @return the plano
	 */
	public String getPlano() {
		return plano;
	}


	/**
	 * @return the relacionAspecto
	 */
	public String getRelacionAspecto() {
		return relacionAspecto;
	}


	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}


	/**
	 * @return the generoFotografico
	 */
	public String getGeneroFotografico() {
		return generoFotografico;
	}


	/**
	 * @return the tecnica
	 */
	public String getTecnica() {
		return tecnica;
	}
	
	/*
	 * Métodos de Fotografia (Si los tiene).
	 */
}
