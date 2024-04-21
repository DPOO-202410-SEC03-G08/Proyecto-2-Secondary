package dpoo.galeria.modelo.pieza;

import java.util.Date;

import java.util.List;


public class Video extends Pieza {
    private int duracion;
    private String resolucionVideo;
    private int fotogramasPorSegundo;
    private String relacionAspecto;
    private String formato;

	public Video(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores, String modalidadVenta,
			Date fechaEntrega, int ID, String IDpropietario, List<String> detallesAdicionales, int duracion, String resolucionVideo,
            int fotogramasPorSegundo, String relacionAspecto, String formato) {
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, ID, IDpropietario,
				detallesAdicionales);
		this.duracion = duracion;
        this.resolucionVideo = resolucionVideo;
        this.fotogramasPorSegundo = fotogramasPorSegundo;
        this.relacionAspecto = relacionAspecto;
        this.formato = formato;
	}

	public int getDuracion() {
        return duracion;
    }

    public String getResolucionVideo() {
        return resolucionVideo;
    }

    public int getFotogramasPorSegundo() {
        return fotogramasPorSegundo;
    }

    public String getRelacionAspecto() {
        return relacionAspecto;
    }

    public String getFormato() {
        return formato;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setResolucionVideo(String resolucionVideo) {
        this.resolucionVideo = resolucionVideo;
    }

    public void setFotogramasPorSegundo(int fotogramasPorSegundo) {
        this.fotogramasPorSegundo = fotogramasPorSegundo;
    }

    public void setRelacionAspecto(String relacionAspecto) {
        this.relacionAspecto = relacionAspecto;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

