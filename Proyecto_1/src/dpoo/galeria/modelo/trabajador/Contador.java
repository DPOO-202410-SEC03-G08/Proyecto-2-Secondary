package dpoo.galeria.modelo.trabajador;

import dpoo.galeria.modelo.venta.Venta;

public class Contador extends Trabajador{
	
	public Contador(String nombre, int celular, String ID, String password) 
	{
		super(nombre, celular, ID, password);
	}
	
	/*
	 * Atributos de Contador (Si los tiene).
	 */
	
	public void registrarPago (Venta venta, int userID) 
	{
		inventario.getPagos().put(userID, venta);
	}

	@Override
	public void SetTipo(String tipo) {
		this.tipo = "Contador";
	}
}
