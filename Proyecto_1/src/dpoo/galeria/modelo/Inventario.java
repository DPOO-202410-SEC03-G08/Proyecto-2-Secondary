package dpoo.galeria.modelo;

import java.util.HashMap;
import java.util.Map;

import dpoo.galeria.modelo.pieza.Pieza;
import dpoo.galeria.modelo.trabajador.Trabajador;
import dpoo.galeria.modelo.usuario.Usuario;
import dpoo.galeria.modelo.venta.Venta;

public class Inventario {

	private Map<Integer, Pieza> piezasPasadas;
	private Map<Integer, Pieza> piezasExhibidas;
	private Map<Integer, Pieza> piezasBodega;
	private Map<Integer, Pieza> piezas;
	private Map<Integer, Venta> pagos;
	private Map<String, Usuario> usuarios;
	private Map<String, Trabajador> trabajadores;
	
	public Inventario() {

		piezasPasadas = new HashMap<Integer, Pieza>();
		piezasExhibidas = new HashMap<Integer, Pieza>();
		piezasBodega = new HashMap<Integer, Pieza>();
		piezas = new HashMap<Integer, Pieza>();
		pagos = new HashMap<Integer, Venta>();
		usuarios = new HashMap<String, Usuario>();
		trabajadores = new HashMap<String, Trabajador>();
	}
	
	public void addPiezaToPiezasPasadas (Pieza pieza)
	{
		int ID = pieza.getIDPropietario();
		piezasPasadas.put(ID, pieza);
	}
	
	public void addPiezaToPiezasExhibidas (Pieza pieza)
	{
		int ID = pieza.getIDPropietario();
		piezasExhibidas.put(ID, pieza);
	}
	
	public void addPiezaToPiezasBodega (Pieza pieza)
	{
		int ID = pieza.getIDPropietario();
		piezasBodega.put(ID, pieza);
	}
	
	public void addPiezaToPiezas (Pieza pieza)
	{
		int ID = pieza.getIDPropietario();
		piezas.put(ID, pieza);
	}
	
	public void addPiezaToPagos (Venta venta)
	{
		int ID = venta.getUserID();
		pagos.put(ID, venta);
	}
	
	public void addUsuario (Usuario usuario)
	{
		if (usuario.tipo == "Administrador")
		{
			usuarios.put("Administrador", usuario);
		}	
		else
		{
			usuarios.put("Contador", usuario);
		}
	}
	
	public void addTrabajador (Trabajador trabajador)
	{
		if (trabajador.tipo == "Administrador")
		{
			trabajadores.put("Comprador", trabajador);
		}	
		else
		{
			trabajadores.put("Propietario", trabajador);
		}	}
	
	/**
	 * @return the piezasPasadas
	 */
	public Map<Integer, Pieza> getPiezasPasadas() {
		return piezasPasadas;
	}

	/**
	 * @return the piezasExhibidas
	 */
	public Map<Integer, Pieza> getPiezasExhibidas() {
		return piezasExhibidas;
	}

	/**
	 * @return the piezasBodega
	 */
	public Map<Integer, Pieza> getPiezasBodega() {
		return piezasBodega;
	}

	/**
	 * @return the piezas
	 */
	public Map<Integer, Pieza> getPiezas() {
		return piezas;
	}

	/**
	 * @return the pagos
	 */
	public Map<Integer, Venta> getPagos() {
		return pagos;
	}

	/**
	 * @return the usuarios
	 */
	public Map<String, Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @return the trabajadores
	 */
	public Map<String, Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void devolverPieza (Pieza pieza, boolean confirmacion) {
		
	}
}
