package dpoo.galeria.modelo.usuario;

import java.util.ArrayList;

import dpoo.galeria.modelo.pieza.Pieza;

public class Comprador extends Usuario {

	private int valorMaximo;
	
	public Comprador(String nombre, int numeroCelular, int numeroIdentificacion, String password, int valorMaximo) 
	{
		super(nombre, numeroCelular, numeroIdentificacion, password);
		this.valorMaximo = valorMaximo;
	}

	public void comprarPieza (Pieza pieza) 
	{
		int ID = getNumeroIdentificacion();
		int valorMaximo = getValorMaximo();
		if (administrador.confirmarVenta(pieza,ID,valorMaximo) == true)
		{
			inventario.getPiezas().remove(ID);
			inventario.getPiezasExhibidas().remove(ID);
			inventario.getPiezasBodega().remove(ID);
			inventario.getPiezasPasadas().put(ID, pieza);
		}
	}
	
	public ArrayList<Pieza> consultarPagos () 
	{
		int ID = getNumeroIdentificacion();
		ArrayList<Pieza> misPagos = new ArrayList<Pieza>();
		for(Integer i :inventario.getPiezasPasadas().keySet())
		{
			if (i == ID)
			{
				misPagos.add(inventario.getPiezasPasadas().get(ID));
			}
		}
		return misPagos;
	}

	/**
	 * @return the valorMaximo
	 */
	public int getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * @param valorMaximo the valorMaximo to set
	 */
	public void setValorMaximo(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	@Override
	public void SetTipo(String tipoc) 
	{
		this.tipo = "Comprador";
	}
}
