package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public abstract class Pieza {

	private String titulo;
	private Date fechaCreacion;
	private String lugarCreacion;
	private List<String> autores;
	private String modalidadVenta;
	private Date fechaEntrega;
	private int ID;
	private String IDPropietario;
	private List<String> detallesAdicionales;
	
	public Pieza () {
		
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.lugarCreacion = lugarCreacion;
		this.autores = autores;
		this.modalidadVenta = modalidadVenta;
		this.fechaEntrega = fechaEntrega;
		this.ID = ID;
		this.IDPropietario = IDPropietario;
		this.detallesAdicionales = detallesAdicionales;
	}
	
	/*
	 * Métodos de Pieza (si los tiene).
	 */
}
