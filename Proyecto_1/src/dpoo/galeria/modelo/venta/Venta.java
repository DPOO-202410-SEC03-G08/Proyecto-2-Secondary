package dpoo.galeria.modelo.venta;

public abstract class Venta {

	private String nombre;
	private int celular;
	private int userID;
	private String password;
	
	
	public Venta(String nombre, int celular, int userID, String password) {
		super();
		this.nombre = nombre;
		this.celular = celular;
		this.userID = userID;
		this.password = password;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the celular
	 */
	public int getCelular() {
		return celular;
	}


	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	
	
	/*
	 * Metodos de Venta (Si los tiene).
	 */
}
