package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public abstract class Pieza {

	protected String titulo;
	protected Date fechaCreacion;
	protected String lugarCreacion;
	protected List<String> autores;
	protected String modalidadVenta;
	protected Date fechaEntrega;
	protected int ID;
	protected int IDPropietario;
	protected List<String> detallesAdicionales;
	
	public Pieza(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta, 
			Date fechaEntrega, int ID, int iDPropietario, List<String> detallesAdicionales) 
	{
		super();
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.lugarCreacion = lugarCreacion;
		this.autores = autores;
		this.modalidadVenta = modalidadVenta;
		this.fechaEntrega = fechaEntrega;
		this.ID = ID;
		this.IDPropietario = iDPropietario;
		this.detallesAdicionales = detallesAdicionales;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @return the lugarCreacion
	 */
	public String getLugarCreacion() {
		return lugarCreacion;
	}

	/**
	 * @return the autores
	 */
	public List<String> getAutores() {
		return autores;
	}

	/**
	 * @return the modalidadVenta
	 */
	public String getModalidadVenta() {
		return modalidadVenta;
	}

	/**
	 * @param modalidadVenta the modalidadVenta to set
	 */
	public void setModalidadVenta(String modalidadVenta) {
		this.modalidadVenta = modalidadVenta;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the iDPropietario
	 */
	public int getIDPropietario() {
		return IDPropietario;
	}

	/**
	 * @return the detallesAdicionales
	 */
	public List<String> getDetallesAdicionales() {
		return detallesAdicionales;
	}
	
	/*
	 * Métodos de Pieza (si los tiene).
	 */
}
