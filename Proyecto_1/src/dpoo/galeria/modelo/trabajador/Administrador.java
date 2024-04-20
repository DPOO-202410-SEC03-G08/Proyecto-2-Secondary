package dpoo.galeria.modelo.trabajador;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.usuario.Comprador;
import dpoo.galeria.modelo.usuario.Propietario;

public class Administrador extends Trabajador{

	/*
	 * Atributos de Administrador (Si los tiene).
	 */
	
	public Administrador () {
		
		/*
		 * Constructor de Administrador.
		 */
	}
	
	public boolean confirmarVenta (Pieza pieza, Comprador comprador) {
		
		return false;
	}
	
	public boolean confirmarDevolucion (Pieza pieza) {
		
		return false;
	}
	
	public boolean confirmarConsignacion (Pieza pieza, Propietario propietario) {
		
		return false;
	}
}
