package dpoo.galeria.modelo.venta;

import dpoo.galeria.modelo.pieza.Pieza;

public class Subasta extends Venta{

	public String ID = "Subasta";
	public int precioInicialSubasta;
	public int precioMinimoSubasta;
	public int precioOfertaSubasta;
	
	
	
	public Subasta(String nombre, int celular, int userID, String password, String iD, int precioInicialSubasta, 
			int precioMinimoSubasta, int precioOfertaSubasta) 
	{
		super(nombre, celular, userID, password);
		this.ID = iD;
		this.precioInicialSubasta = precioInicialSubasta;
		this.precioMinimoSubasta = precioMinimoSubasta;
		this.precioOfertaSubasta = precioOfertaSubasta;
	}

	public void venderSubasta (Pieza pieza, boolean confirmacion) {
		
	}
}
