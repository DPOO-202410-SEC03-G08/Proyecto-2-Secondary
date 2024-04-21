package dpoo.galeria.modelo.pieza;

import java.util.Date;
import java.util.List;

public class Fotografia extends Pieza {
	
	private String resolucionFoto;
	private String plano;
    private String relacionAspecto;
    private String formato;
    private String generoFotografico;
    private String tecnica;

	public Fotografia(String titulo, Date fechaCreacion, String lugarCreacion, List<String> autores,
			String modalidadVenta, Date fechaEntrega, int ID, String IDpropietario, List<String> detallesAdicionales,  String resolucionFoto, String plano,
            String relacionAspecto, String formato, String generoFotografico, String tecnica) {
		super(titulo, fechaCreacion, lugarCreacion, autores, modalidadVenta, fechaEntrega, ID, IDpropietario,
				detallesAdicionales);
		this.resolucionFoto = resolucionFoto;
        this.plano = plano;
        this.relacionAspecto = relacionAspecto;
        this.formato = formato;
        this.generoFotografico = generoFotografico;
        this.tecnica = tecnica;
		
		
	}

	public String getResolucionFoto() {
        return resolucionFoto;
    }

    public void setResolucionFoto(String resolucionFoto) {
        this.resolucionFoto = resolucionFoto;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getRelacionAspecto() {
        return relacionAspecto;
    }

    public void setRelacionAspecto(String relacionAspecto) {
        this.relacionAspecto = relacionAspecto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getGeneroFotografico() {
        return generoFotografico;
    }

    public void setGeneroFotografico(String generoFotografico) {
        this.generoFotografico = generoFotografico;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
}