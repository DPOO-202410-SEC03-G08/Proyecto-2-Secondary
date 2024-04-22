package dpoo.galeria.modelo.trabajador;

import dpoo.galeria.modelo.Inventario;

public abstract class Trabajador {

	protected String nombre;
	protected int celular;
	protected String ID;
	protected String password;
	protected Inventario inventario;
	public String tipo;
	
	public Trabajador(String nombre, int celular, String ID, String password) 
	{
		super();
		this.nombre = nombre;
		this.celular = celular;
		this.ID = ID;
		this.password = password;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the celular
	 */
	public int getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(int celular) {
		this.celular = celular;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public abstract void SetTipo(String tipo);
	/*
	 * Metodos de Trabajador (Si los tiene).
	 */
}
