package dpoo.galeria.modelo.usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import dpoo.galeria.modelo.pieza.Pieza;

public class Propietario extends Usuario{

	private Map<Integer, Pieza> piezasPropietario;
	
	public Propietario(String nombre, int numeroCelular, int numeroIdentificacion, String password)
	{
		super(nombre, numeroCelular, numeroIdentificacion, password);
		piezasPropietario = new HashMap<Integer, Pieza>( );;
	}

	public void consignarPieza (Pieza pieza) 
	{
		int ID = getNumeroIdentificacion();
		if (administrador.confirmarConsignacion(pieza, ID) == true)
		{
			inventario.getPiezas().put(ID, pieza);
			inventario.getPiezasPasadas().remove(ID);
		}
		
	}

	public ArrayList<Pieza> consultarPiezasComprador () 
	{
		int ID = getNumeroIdentificacion();
		ArrayList<Pieza> misPiezas = new ArrayList<Pieza>();
		for(Integer i :inventario.getPiezas().keySet())
		{
			if (i == ID)
			{
				misPiezas.add(inventario.getPiezas().get(ID));
				piezasPropietario.put(ID, inventario.getPiezas().get(ID));
			}
		}
		return misPiezas;
	}
	
	public ArrayList<Pieza> consultarVentas () 
	{
		int ID = getNumeroIdentificacion();
		ArrayList<Pieza> misVentas = new ArrayList<Pieza>();
		for(Integer i :inventario.getPiezasPasadas().keySet())
		{
			if (i == ID)
			{
				misVentas.add(inventario.getPiezasPasadas().get(ID));
			}
		}
		return misVentas;
	}

	@Override
	public void SetTipo(String tipo) {
		this.tipo = "Propietario";
	}
}
