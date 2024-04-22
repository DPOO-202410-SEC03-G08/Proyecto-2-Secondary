package dpoo.galeria.modelo.usuario;

import java.util.Map;

import dpoo.galeria.modelo.Inventario;
import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.trabajador.Administrador;

public abstract class Usuario {

	protected String nombre;
	protected int numeroCelular;
	protected int numeroIdentificacion;
	protected String password;
	protected Map<String,Pieza> mapaPiezas;
	protected Inventario inventario;
	protected Administrador administrador;
	public String tipo;
	

	public Usuario(String nombre, int numeroCelular, int numeroIdentificacion, String password) 
	{
		super();
		this.nombre = nombre;
		this.numeroCelular = numeroCelular;
		this.numeroIdentificacion = numeroIdentificacion;
		this.password = password;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the numeroCelular
	 */
	public int getNumeroCelular() {
		return numeroCelular;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	public abstract void SetTipo(String tipo);
	
	/*
	 * Metodos de Usuario (Si los tiene).
	 */
}
