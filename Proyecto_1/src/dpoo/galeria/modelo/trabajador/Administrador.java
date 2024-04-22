package dpoo.galeria.modelo.trabajador;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.usuario.Usuario;
import dpoo.galeria.modelo.venta.Venta;

public class Administrador extends Trabajador
{	
	public Administrador(String nombre, int celular, String ID, String password) 
	{
		super(nombre, celular, ID, password);
	}

	/*
	 * Atributos de Administrador (Si los tiene).
	 */
	
	public boolean confirmarVenta (Pieza pieza, int IDcomprador, int c) 
	{
		boolean confirmacion = false;
		for(Usuario i :inventario.getUsuarios().values())
		{
			if((i.getNumeroIdentificacion() == IDcomprador) && (inventario.getPiezasPasadas().containsValue(pieza) == false))
			{
				confirmacion = true;
			}
		}
		int contador = 0;
		for(Venta i : inventario.getPagos().values())
		{
			if (i.getUserID() == IDcomprador)
			{
				contador += 1;
			}
		}
		if (contador > contador)
		{
			confirmacion = false;
		}
		return confirmacion;
	}
	
	public boolean confirmarDevolucion (Pieza pieza) {
		
		return false;
	}
	
	public boolean confirmarConsignacion (Pieza pieza, int IDpropietario) {
		
		return false;
	}

	@Override
	public void SetTipo(String tipo) {
		this.tipo = "Administrador";
	}
}
