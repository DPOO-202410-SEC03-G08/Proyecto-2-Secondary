package dpoo.galeria.modelo.venta;

import dpoo.galeria.modelo.pieza.Pieza;

public class VentaFija extends Venta {

	public String ID = "Venta Fija";
	public int precioTotal;
	
	public VentaFija () {
		
		this.ID = ID;
		this.precioTotal = precioTotal;
	}
	
	public void venderFijo (Pieza pieza, boolean confirmacion) {
		
	}
}
