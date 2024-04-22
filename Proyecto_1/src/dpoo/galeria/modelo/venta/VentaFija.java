package dpoo.galeria.modelo.venta;

import dpoo.galeria.modelo.pieza.Pieza;

public class VentaFija extends Venta {

	public String ID = "Venta Fija";
	public int precioTotal;
	
	public VentaFija(String nombre, int celular, int userID, String password, String iD, int precioTotal) {
		super(nombre, celular, userID, password);
		ID = iD;
		this.precioTotal = precioTotal;
	}

	public void venderFijo (Pieza pieza, boolean confirmacion) {
		
	}
}
