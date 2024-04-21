package dpoo.galeria.modelo.pieza;
import java.util.Date;
import java.util.List;

public class Escultura extends Pieza {
	private double alto;
    private double ancho;
    private double profundidad;
    private List<String> materialesConstruccion;
    private double peso;
    private boolean necesitaElectricidad;

	public Escultura(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores,
			String modalidadVenta, Date fechaEntrega, int ID, String IDpropietario, List<String> detallesAdicionales, double alto, double ancho, double profundidad,
            List<String> materialesConstruccion, double peso, boolean necesitaElectricidad) {
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, ID, IDpropietario,
				detallesAdicionales);
		this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.materialesConstruccion = materialesConstruccion;
        this.peso = peso;
        this.necesitaElectricidad = necesitaElectricidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public List<String> getMaterialesConstruccion() {
        return materialesConstruccion;
    }

    public void setMaterialesConstruccion(List<String> materialesConstruccion) {
        this.materialesConstruccion = materialesConstruccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getNecesitaElectricidad() {
        return necesitaElectricidad;
    }

    public void setNecesitaElectricidad(boolean necesitaElectricidad) {
        this.necesitaElectricidad = necesitaElectricidad;
    }
}