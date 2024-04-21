package dpoo.galeria.modelo.usuario;

import java.util.List;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.venta.Venta;

public class Comprador extends Usuario {

	public int valorMaximo;
	
	public Comprador () {
		
		this.valorMaximo = valorMaximo;
	}
	
	public void comprarPieza (Pieza pieza, boolean confirmacion) {
		
	}
	
	public List<Venta> consultarPagos (String ID) {
		
		return null;
	}
}
