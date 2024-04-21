package dpoo.galeria.modelo.venta;

import dpoo.galeria.modelo.pieza.Pieza;

public class Subasta extends Venta{

	public String ID = "Subasta";
	public int precioInicialSubasta;
	public int precioMinimoSubasta;
	public int precioOfertaSubasta;
	
	public Subasta () {
		
		this.ID = ID;
		this.precioInicialSubasta = precioInicialSubasta;
		this.precioMinimoSubasta = precioMinimoSubasta;
		this.precioOfertaSubasta = precioOfertaSubasta;
	}
	
	public void venderSubasta (Pieza pieza, boolean confirmacion) {
		
	}
}
