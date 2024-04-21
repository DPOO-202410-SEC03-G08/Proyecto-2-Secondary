package dpoo.galeria.modelo;

import java.util.Map;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.venta.Pago;

public class Inventario {

	public Map<Integer, Pieza> piezasPasadas;
	public Map<Integer, Pieza> piezasExhibidas;
	public Map<Integer, Pieza> piezasBodega;
	public Map<String, Pago> pagos;
	
	public Inventario () {
		
		this.piezasPasadas = piezasPasadas;
		this.piezasExhibidas = piezasExhibidas;
		this.piezasBodega = piezasBodega;
		this.pagos = pagos;
	}
	
	public void devolverPieza (Pieza pieza, boolean confirmacion) {
		
	}
}
