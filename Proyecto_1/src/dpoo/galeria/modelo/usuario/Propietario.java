package dpoo.galeria.modelo.usuario;

import java.util.List;
import java.util.Map;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.venta.Venta;

public class Propietario extends Usuario{

	public Map<Integer, Pieza> piezasPropietario;
	
	public Propietario () {
		
		this.piezasPropietario = piezasPropietario;
	}
	
	public void consignarPieza (Pieza pieza, boolean confirmacion) {
		
	}
	
	public List<Pieza> consultarPiezasComprador (String ID) {
		
		return null;
	}
	
	public List<Venta> consultarVentas (String ID) {
		
		return null;
	}
}
