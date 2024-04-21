package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;


public class Impresion extends Pieza {
	private double alto;
    private double ancho;
    private String tipoPapel;
    private String formatoImpresion;


	public Impresion(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores,
			String modalidadVenta, Date fechaEntrega, int ID, String IDpropietario, List<String> detallesAdicionales, double alto, double ancho,
            String tipoPapel, String formatoImpresion) {
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, ID, IDpropietario,
				detallesAdicionales);
	this.alto = alto;
    this.ancho = ancho;
    this.tipoPapel = tipoPapel;
    this.formatoImpresion = formatoImpresion;
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

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

    public String getFormatoImpresion() {
        return formatoImpresion;
    }

    public void setFormatoImpresion(String formatoImpresion) {
        this.formatoImpresion = formatoImpresion;
    }
}
